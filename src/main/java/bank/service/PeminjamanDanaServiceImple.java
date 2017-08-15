package bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bank.dao.PeminjamanDanaDao;
import bank.model.PeminjamanDana;

@Service
@Transactional
public class PeminjamanDanaServiceImple implements PeminjamanDanaService {
	
	@Autowired
	PeminjamanDanaDao pinjamDnDao;

	@Override
	public void save(PeminjamanDana pinjamdn) {
		// TODO Auto-generated method stub
		pinjamDnDao.save(pinjamdn);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pinjamDnDao.delete(id);
	}

	@Override
	public void update(PeminjamanDana pinjamdn) {
		// TODO Auto-generated method stub
		pinjamDnDao.update(pinjamdn);
	}

	@Override
	public List<PeminjamanDana> getAllPeminjamanDana() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PeminjamanDana getPeminjamanDanaById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}