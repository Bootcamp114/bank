package bank.service;

import java.util.List;

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

	@Override
	public List<MyFiles> listMyFiles() {
		// TODO Auto-generated method stub
		return myFileDao.listMyFiles();
	}

	@Override
	public MyFiles getMyFilesById(int id) {
		// TODO Auto-generated method stub
		return myFileDao.getMyFilesById(id);
	}

}
