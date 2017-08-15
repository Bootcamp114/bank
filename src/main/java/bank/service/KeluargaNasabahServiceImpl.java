package bank.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import bank.dao.KeluargaNasabahDao;
import bank.model.KeluargaNasabah;

@Service
@Transactional
public class KeluargaNasabahServiceImpl implements KeluargaNasabahService {

	@Autowired
	KeluargaNasabahDao keluargaNasabahDao;

	@Override
	public void save(KeluargaNasabah keluargaNasabah) {
		// TODO Auto-generated method stub
		keluargaNasabahDao.save(keluargaNasabah);
	}

	@Override
	public void update(KeluargaNasabah keluargaNasabah) {
		// TODO Auto-generated method stub
		keluargaNasabahDao.update(keluargaNasabah);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		keluargaNasabahDao.delete(id);
	}

	@Override
	public List<KeluargaNasabah> getAllKeluargaNasabah() {
		// TODO Auto-generated method stub
		return keluargaNasabahDao.getAllKeluargaNasabah();
	}

	@Override
	public KeluargaNasabah getKeluargaNasabahById(int id) {
		// TODO Auto-generated method stub
		return keluargaNasabahDao.getKeluargaNasabahById(id);
	}
}