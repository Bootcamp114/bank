package bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bank.dao.ClassAsuransiDao;
import bank.model.ClassAsuransi;

@Service
@Transactional
public class ClassAsuransiServiceImpl implements ClassAsuransiService {
	
	@Autowired
	private ClassAsuransiDao classAsuransiDao;

	@Override
	public void save(ClassAsuransi classAsuransi) {
		// TODO Auto-generated method stub
		classAsuransiDao.save(classAsuransi);
		
		
	}

	
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		classAsuransiDao.delete(id);
		
	}

	@Override
	public void update(ClassAsuransi classAsuransi) {
		// TODO Auto-generated method stub
		classAsuransiDao.update(classAsuransi);
		
	}

	@Override
	public List<ClassAsuransi> getAllClassAsuransi() {
		// TODO Auto-generated method stub
		return classAsuransiDao.getAllClassAsuransi();
	}

	@Override
	public ClassAsuransi getClassAsuransiById(int id) {
		// TODO Auto-generated method stub
		return classAsuransiDao.getCLassAsuransiById(id);
	}

}
