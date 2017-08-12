package bank.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bank.model.ProdukAsuransi;

@Repository
public class ProdukAsuransiImpl implements ProdukAsuransiDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(ProdukAsuransi proukAsuransi) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(proukAsuransi);
		session.flush();
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		ProdukAsuransi produkAsuransi = new ProdukAsuransi();
		produkAsuransi.setId(id);
		produkAsuransi.setProduk("will be delete");
		session.delete(id);
		session.flush();
		
	}

	@Override
	public void update(ProdukAsuransi produkAsuransi) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(produkAsuransi);
		session.flush();
		
	}

	@Override
	public List<ProdukAsuransi> getAllProdukAsuransi() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<ProdukAsuransi> listProdukAsuransi = session.createCriteria(ProdukAsuransi.class).list();
		return listProdukAsuransi;
	}

	@Override
	public ProdukAsuransi getProdukAsuransiById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		ProdukAsuransi produkAsuransi = session.get(ProdukAsuransi.class,id);
		return produkAsuransi;
	}

}
