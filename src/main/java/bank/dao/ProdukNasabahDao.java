package bank.dao;

import java.util.List;
import bank.model.ProdukNasabah;

public interface ProdukNasabahDao {

	public void save(ProdukNasabah produkNasabah);

	public void update(ProdukNasabah produkNasabah);

	public void delete(int id);

	public List<ProdukNasabah> getAllProdukNasabah();

	public ProdukNasabah getProdukNasabahById(int id);
}