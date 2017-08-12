package bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bank.dao.ProdukAsuransiDao;
import bank.model.ProdukAsuransi;

@Service
@Transactional
public class ProdukAsuransiServiceImpl implements ProdukAsuransiService {

	@Autowired
	private ProdukAsuransiDao produkAsuransiDao;
	
	@Override
	public void save(ProdukAsuransi produkAsuransi) {
		// TODO Auto-generated method stub
		produkAsuransiDao.save(produkAsuransi);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		produkAsuransiDao.delete(id);
		
	}

	@Override
	public void update(ProdukAsuransi produkAsuransi) {
		// TODO Auto-generated method stub
		produkAsuransiDao.update(produkAsuransi);
		
	}

	@Override
	public List<ProdukAsuransi> getAllProdkAsuransi() {
		// TODO Auto-generated method stub
		return produkAsuransiDao.getAllProdukAsuransi();
	}

	@Override
	public ProdukAsuransi getProdukAsuransiById(int id) {
		// TODO Auto-generated method stub
		return produkAsuransiDao.getProdukAsuransiById(id);
	}
	
	

}
