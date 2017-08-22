package bank.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bank.model.ProdukNasabah;

@Repository
public class ProdukNasabahDaoImpl implements ProdukNasabahDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void save(ProdukNasabah produkNasabah) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(produkNasabah);
		session.flush();
	}

	@Override
	public void update(ProdukNasabah produkNasabah) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(produkNasabah);
		session.flush();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		ProdukNasabah produkNasabah = new ProdukNasabah();
		produkNasabah.setId(id);
		produkNasabah.setNamaProduk("~");
		session.delete(produkNasabah);
		session.flush();
	}

	@Override
	public List<ProdukNasabah> getAllProdukNasabah() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<ProdukNasabah> listProdukNasabah = session.createQuery("from " + ProdukNasabah.class.getName() + " order by id").list();
		return listProdukNasabah;
	}

	@Override
	public ProdukNasabah getProdukNasabahById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		ProdukNasabah produkNasabah = session.get(ProdukNasabah.class, id);
		return produkNasabah;
	}
}