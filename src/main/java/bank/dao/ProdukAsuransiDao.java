package bank.dao;

import java.util.List;

import bank.model.ProdukAsuransi;

public interface ProdukAsuransiDao {
	
	public void save(ProdukAsuransi proukAsuransi);
	
	public void delete(int id);
	
	public void update(ProdukAsuransi produkAsuransi);
	
	public List<ProdukAsuransi> getAllProdukAsuransi();
	
	public ProdukAsuransi getProdukAsuransiById(int id);

}
