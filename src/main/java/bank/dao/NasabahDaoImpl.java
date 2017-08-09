package bank.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import bank.model.Nasabah;

@Repository
public class NasabahDaoImpl implements NasabahDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void save(Nasabah nasabah) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(nasabah);
		session.flush();
	}

	@Override
	public void update(Nasabah nasabah) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(nasabah);
		session.flush();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Nasabah nasabah = new Nasabah();
		nasabah.setId(id);
		nasabah.setNama("~");
		session.delete(nasabah);
		session.flush();
	}
}