package bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import bank.dao.NasabahDao;
import bank.model.Nasabah;

@Service
@Transactional
public class NasabahServiceImpl implements NasabahService {

	@Autowired
	NasabahDao nasabahDao;

	@Override
	public void save(Nasabah nasabah) {
		// TODO Auto-generated method stub
		nasabahDao.save(nasabah);
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
}