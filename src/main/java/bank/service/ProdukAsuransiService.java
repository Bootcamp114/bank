package bank.service;

import java.util.List;

import bank.model.ProdukAsuransi;

public interface ProdukAsuransiService {
	
	public void save(ProdukAsuransi produkAsuransi);
	
	public void delete(int id);
	
	public void update(ProdukAsuransi produkAsuransi);
	
	public List<ProdukAsuransi> getAllProdkAsuransi();
	
	public ProdukAsuransi getProdukAsuransiById(int id);

}
