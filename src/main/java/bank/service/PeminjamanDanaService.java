package bank.service;

import java.util.List;

import bank.model.PeminjamanDana;

public interface PeminjamanDanaService {

	public void save(PeminjamanDana pinjamdn);

	public void delete(int id);
	
	public void update(PeminjamanDana pinjamdn);
	
	public List<PeminjamanDana> getAllPeminjamanDana();
	
	public PeminjamanDana getPeminjamanDanaById(int id);
}
