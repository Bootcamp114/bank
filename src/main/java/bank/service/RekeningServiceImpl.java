package bank.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import bank.dao.RekeningDao;
import bank.model.Rekening;

@Service
@Transactional
public class RekeningServiceImpl implements RekeningService {

	@Autowired
	RekeningDao rekeningDao;

	@Override
	public void save(Rekening rekening) {
		// TODO Auto-generated method stub
		rekeningDao.save(rekening);
	}

	@Override
	public void update(Rekening rekening) {
		// TODO Auto-generated method stub
		rekeningDao.update(rekening);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		rekeningDao.delete(id);
	}

	@Override
	public List<Rekening> getAllRekening() {
		// TODO Auto-generated method stub
		return rekeningDao.getAllRekening();
	}

	@Override
	public Rekening getRekeningById(int id) {
		// TODO Auto-generated method stub
		return rekeningDao.getRekeningById(id);
	}
}