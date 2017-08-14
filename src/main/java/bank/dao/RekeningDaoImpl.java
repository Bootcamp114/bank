package bank.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import bank.model.Rekening;

@Repository
public class RekeningDaoImpl implements RekeningDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void save(Rekening rekening) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(rekening);
		session.flush();
	}

	@Override
	public void update(Rekening rekening) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(rekening);
		session.flush();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Rekening rekening = new Rekening();
		rekening.setId(id);
		rekening.setRekening("~");
		session.delete(rekening);
		session.flush();
	}

	@Override
	public List<Rekening> getAllRekening() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Rekening> listRekening = session.createCriteria(Rekening.class).list();
		return listRekening;
	}

	@Override
	public Rekening getRekeningById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Rekening rekening = session.get(Rekening.class, id);
		return rekening;
	}
}