package bank.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bank.model.MyFiles;

@Repository
public class MyFileDaoImple implements MyFileDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(MyFiles myFiles) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(myFiles);
		session.flush();
	}

	@Override
	public List<MyFiles> listMyFiles() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<MyFiles> list = session.createCriteria(MyFiles.class).list();
		return list;
	}

	@Override
	public MyFiles getMyFilesById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		MyFiles myFiles = session.get(MyFiles.class, id);
		return myFiles;
	}

}
