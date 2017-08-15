package bank.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import bank.model.KeluargaNasabah;

@Repository
public class KeluargaNasabahDaoImpl implements KeluargaNasabahDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void save(KeluargaNasabah keluargaNasabah) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(keluargaNasabah);
		session.flush();
	}

	@Override
	public void update(KeluargaNasabah keluargaNasabah) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(keluargaNasabah);
		session.flush();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		KeluargaNasabah keluargaNasabah = new KeluargaNasabah();
		keluargaNasabah.setId(id);
		keluargaNasabah.setNama("~");
		session.delete(keluargaNasabah);
		session.flush();
	}

	@Override
	public List<KeluargaNasabah> getAllKeluargaNasabah() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<KeluargaNasabah> listKeluargaNasabah = session.createCriteria(KeluargaNasabah.class).list();
		return listKeluargaNasabah;
	}

	@Override
	public KeluargaNasabah getKeluargaNasabahById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		KeluargaNasabah keluargaNasabah = session.get(KeluargaNasabah.class, id);
		return keluargaNasabah;
	}
}