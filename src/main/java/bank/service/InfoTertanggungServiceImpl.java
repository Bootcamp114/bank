package bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bank.dao.InfoTertanggungDao;
import bank.model.InfoTertanggung;

@Service
@Transactional
public class InfoTertanggungServiceImpl implements InfoTertanggungService {

	@Autowired
	private InfoTertanggungDao infoTertanggungDao;
	
	@Override
	public void save(InfoTertanggung infoTertanggung) {
		// TODO Auto-generated method stub
		infoTertanggungDao.save(infoTertanggung);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		infoTertanggungDao.delete(id);
	}

	@Override
	public void update(InfoTertanggung infoTertanggung) {
		// TODO Auto-generated method stub
		infoTertanggungDao.update(infoTertanggung);
	}

	@Override
	public List<InfoTertanggung> getAllInfoTertanggung() {
		// TODO Auto-generated method stub
		return infoTertanggungDao.getAllInfoTertanggung();
	}

	@Override
	public InfoTertanggung getInfoTertanggungById(int id) {
		// TODO Auto-generated method stub
		return infoTertanggungDao.getInfoTertanggungById(id);
	}

}
