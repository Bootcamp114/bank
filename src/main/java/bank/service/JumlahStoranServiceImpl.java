package bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bank.dao.JumlahStoranDao;
import bank.model.JumlahStoran;

@Service
@Transactional
public class JumlahStoranServiceImpl implements JumlahStoranService {

	@Autowired
	private JumlahStoranDao jumlahStoranDao;
	
	@Override
	public void save(JumlahStoran jumlahStoran) {
		// TODO Auto-generated method stub
		jumlahStoranDao.save(jumlahStoran);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		jumlahStoranDao.delete(id);
		
	}

	@Override
	public void update(JumlahStoran jumlahStoran) {
		// TODO Auto-generated method stub
		jumlahStoranDao.update(jumlahStoran);
		
	}

	@Override
	public List<JumlahStoran> getAllJumlahStoran() {
		// TODO Auto-generated method stub
		return jumlahStoranDao.getAllJumlahStoran();
	}

	@Override
	public JumlahStoran getJumlahStoranById(int id) {
		// TODO Auto-generated method stub
		return jumlahStoranDao.getJumlahStoranById(id);
	}

}
