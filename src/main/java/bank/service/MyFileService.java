package bank.service;

import java.util.List;

import bank.model.MyFiles;

public interface MyFileService {

	public void save(MyFiles myFiles);
	
	public List<MyFiles> listMyFiles();
	
	public MyFiles getMyFilesById(int id);
}
