package bank.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bank.model.InfoTertanggung;
@Repository
public class InfoTertanggungDaoImpl implements InfoTertanggungDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public void save(InfoTertanggung infoTertanggung) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(infoTertanggung);
		session.flush();
				
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		InfoTertanggung infoTertanggung = new InfoTertanggung();
		infoTertanggung.setId(id);
		infoTertanggung.setNama("will be delete");
		session.delete(id);
		session.flush();
		
	}

	@Override
	public void update(InfoTertanggung infoTertanggung) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(infoTertanggung);
		session.flush();
		
	}

	@Override
	public List<InfoTertanggung> getAllInfoTertanggung() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<InfoTertanggung> listInfoTertanggung = session.createCriteria(InfoTertanggung.class).list();
		return listInfoTertanggung;
	}

	@Override
	public InfoTertanggung getInfoTertanggungById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		InfoTertanggung infoTertanggung = session.get(InfoTertanggung.class , id);
		return infoTertanggung;
	}

}
