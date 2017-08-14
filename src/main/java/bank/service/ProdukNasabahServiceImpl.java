package bank.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import bank.dao.ProdukNasabahDao;
import bank.model.ProdukNasabah;

@Service
@Transactional
public class ProdukNasabahServiceImpl implements ProdukNasabahService{

	@Autowired
	ProdukNasabahDao produkNasabahDao;

	@Override
	public void save(ProdukNasabah produkNasabah) {
		// TODO Auto-generated method stub
		produkNasabahDao.save(produkNasabah);
	}

	@Override
	public void update(ProdukNasabah produkNasabah) {
		// TODO Auto-generated method stub
		produkNasabahDao.update(produkNasabah);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		produkNasabahDao.delete(id);
	}

	@Override
	public List<ProdukNasabah> getAllProdukNasabah() {
		// TODO Auto-generated method stub
		return produkNasabahDao.getAllProdukNasabah();
	}

	@Override
	public ProdukNasabah getProdukNasabahById(int id) {
		// TODO Auto-generated method stub
		return produkNasabahDao.getProdukNasabahById(id);
	}
}