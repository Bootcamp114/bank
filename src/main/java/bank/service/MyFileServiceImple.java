package bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bank.dao.MyFileDao;
import bank.model.MyFiles;

@Service
@Transactional
public class MyFileServiceImple implements MyFileService {

	@Autowired
	MyFileDao myFileDao;
	
	@Override
	public void save(MyFiles myFiles) {
		// TODO Auto-generated method stub
		myFileDao.save(myFiles);
	}

}
