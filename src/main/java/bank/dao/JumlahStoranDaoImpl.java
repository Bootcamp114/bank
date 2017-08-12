package bank.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import bank.model.JumlahStoran;

@Repository
public class JumlahStoranDaoImpl implements JumlahStoranDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(JumlahStoran jumlahStroran) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(jumlahStroran);
		session.flush();
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		JumlahStoran jumlahStoran = new JumlahStoran();
		jumlahStoran.setId(id);
		jumlahStoran.setJumlahStoran(null);
		session.delete(id);
		session.flush();
		

	}

	@Override
	public void update(JumlahStoran jumlahStoran) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(jumlahStoran);
		session.flush();
		
	}

	@Override
	public List<JumlahStoran> getAllJumlahStoran() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<JumlahStoran> listJumlahStoran = session.createCriteria(JumlahStoran.class).list();
		return listJumlahStoran;
	}

	@Override
	public JumlahStoran getJumlahStoranById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		JumlahStoran jumlahStoran = session.get(JumlahStoran.class, id);
		return jumlahStoran;
	}

}
