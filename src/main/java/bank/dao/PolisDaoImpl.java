package bank.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bank.model.Polis;

@Repository
public class PolisDaoImpl implements PolisDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Polis polis) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(polis);
		session.flush();
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Polis polis = new Polis();
		polis.setId(id);
		polis.setAhliWaris("will be delete");
		session.delete(polis);
		session.flush();
	}

	@Override
	public void update(Polis polis) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(polis);
		session.flush();
		
	}

	@Override
	public List<Polis> getAllPolis() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Polis> listPolis = session.createCriteria(Polis.class).list();
		return listPolis;
	}

	@Override
	public Polis getPolisById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Polis polis = session.get(Polis.class, id);
		return polis;
	}

}
