package bank.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bank.model.PeminjamanDana;

@Repository
public class PeminjamanDanaDaoImple implements PeminjamanDanaDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void save(PeminjamanDana pinjamdn) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(pinjamdn);
		session.flush();
	}

}
