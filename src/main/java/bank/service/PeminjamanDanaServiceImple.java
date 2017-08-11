package bank.service;

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

}