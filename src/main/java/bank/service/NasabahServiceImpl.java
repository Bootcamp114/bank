package bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bank.dao.KeluargaNasabahDao;
import bank.dao.NasabahDao;
import bank.model.KeluargaNasabah;
import bank.model.Nasabah;

@Service
@Transactional
public class NasabahServiceImpl implements NasabahService {

	@Autowired
	NasabahDao nasabahDao;
	@Autowired
	KeluargaNasabahDao keluargaNasabahDao;

	@Override
	public void save(Nasabah nasabah) {
		// TODO Auto-generated method stub
		nasabahDao.save(nasabah);
		for (KeluargaNasabah keluarga : nasabah.getKeluargaNasabah()) {
			// keluarga.getNasabah().setId(nasabah.getId());
			keluarga.setNasabah(nasabah);
			keluargaNasabahDao.save(keluarga);
		}
	}

	@Override
	public void update(Nasabah nasabah) {
		// TODO Auto-generated method stub
		nasabahDao.update(nasabah);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		nasabahDao.delete(id);
	}

	@Override
	public List<Nasabah> getAllNasabah() {
		// TODO Auto-generated method stub
		return nasabahDao.getAllNasabah();
	}

	@Override
	public Nasabah getNasbahById(int id) {
		// TODO Auto-generated method stub
		return nasabahDao.getNasabahById(id);
	}
}