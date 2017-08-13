package bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bank.dao.PolisDao;
import bank.model.Polis;

@Service
@Transactional
public class PolisServiceImpl implements PolisService {

	@Autowired
	private PolisDao polisDao;
	
	@Override
	public void save(Polis polis) {
		// TODO Auto-generated method stub
		polisDao.save(polis);
		
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		polisDao.delete(id);
		
	}

	@Override
	public void update(Polis polis) {
		// TODO Auto-generated method stub
		polisDao.update(polis);
		
	}

	@Override
	public List<Polis> getAllPolis() {
		// TODO Auto-generated method stub
		return polisDao.getAllPolis();
	}

	@Override
	public Polis getPolisById(int id) {
		// TODO Auto-generated method stub
		return polisDao.getPolisById(id);
	}

}
