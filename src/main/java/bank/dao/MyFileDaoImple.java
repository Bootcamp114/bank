package bank.dao;

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

}
