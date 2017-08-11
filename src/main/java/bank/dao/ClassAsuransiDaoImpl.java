package bank.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bank.model.ClassAsuransi;

@Repository
public class ClassAsuransiDaoImpl implements ClassAsuransiDao {
	
	@Autowired
	private SessionFactory sessionFactory; 
	

	@Override
	public void save(ClassAsuransi classAsuransi) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(classAsuransi);
		session.flush();
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		ClassAsuransi classAsuransi = new ClassAsuransi();
		classAsuransi.setId(id);
		classAsuransi.setType("will delete");
		session.delete(classAsuransi);
		session.flush();
		
	}

	@Override
	public void update(ClassAsuransi classAsuransi) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(classAsuransi);
		session.flush();
		
		
	}

	@Override
	public List<ClassAsuransi> getAllClassAsuransi() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<ClassAsuransi> listClassAsuransi = session.createCriteria(ClassAsuransi.class).list();
		return listClassAsuransi;
	}

	@Override
	public ClassAsuransi getCLassAsuransiById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		ClassAsuransi classAsuransi = session.get(ClassAsuransi.class, id);
		return classAsuransi;
	}

}
