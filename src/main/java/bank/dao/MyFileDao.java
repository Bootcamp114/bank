package bank.dao;

import java.util.List;

import bank.model.MyFiles;

public interface MyFileDao {

	public void save(MyFiles myFiles);
	
	public List<MyFiles> listMyFiles();
	
	public MyFiles getMyFilesById(int id);
}
