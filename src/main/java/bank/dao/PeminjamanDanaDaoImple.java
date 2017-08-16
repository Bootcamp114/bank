package bank.dao;

import java.util.List;

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

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		PeminjamanDana pinjamDn = new PeminjamanDana();
		pinjamDn.setId(id);
		pinjamDn.setTujuanPenggunaan(null);
		session.delete(id);
		session.flush();
	}

	@Override
	public void update(PeminjamanDana pinjamdn) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(pinjamdn);
		session.flush();
	}

	@Override
	public List<PeminjamanDana> getAllPeminjamanDana() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<PeminjamanDana> peminjamanDana = session.createCriteria(PeminjamanDana.class).list();
		return peminjamanDana;
	}

	@Override
	public PeminjamanDana getPeminjamanDanaById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		PeminjamanDana peminjamanDana = session.get(PeminjamanDana.class, id);
		return peminjamanDana;
	}

}
