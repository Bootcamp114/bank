package bank.dao;

import bank.model.PeminjamanDana;

public interface PeminjamanDanaDao {

	public void save(PeminjamanDana pinjamdn);

	public void delete(int id);

	public void update(PeminjamanDana pinjamdn);

}
