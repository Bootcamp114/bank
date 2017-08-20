package bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bank.dao.MyFileDao;
import bank.dao.PeminjamanDanaDao;
import bank.model.MyFiles;
import bank.model.PeminjamanDana;

@Service
@Transactional
public class PeminjamanDanaServiceImple implements PeminjamanDanaService {
	
	@Autowired
	PeminjamanDanaDao pinjamDnDao;
	@Autowired
	MyFileDao myFileDao;

	@Override
	public void save(PeminjamanDana pinjamdn) {
		// TODO Auto-generated method stub
		pinjamDnDao.save(pinjamdn);
		for(MyFiles myFiles : pinjamdn.getMyFiles()) {
			myFiles.setPeminjamanDana(pinjamdn);
			myFileDao.save(myFiles);
		}
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
		return pinjamDnDao.getAllPeminjamanDana();
	}

	@Override
	public PeminjamanDana getPeminjamanDanaById(int id) {
		// TODO Auto-generated method stub
		return pinjamDnDao.getPeminjamanDanaById(id);
	}

}