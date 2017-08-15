package bank.dao;

import java.util.List;

import bank.model.PeminjamanDana;

public interface PeminjamanDanaDao {

	public void save(PeminjamanDana pinjamdn);

	public void delete(int id);

	public void update(PeminjamanDana pinjamdn);

	public List<PeminjamanDana> getAllPeminjamanDana();
	
	public PeminjamanDana getPeminjamanDanaById(int id);
}
