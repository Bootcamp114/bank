package bank.dao;

import bank.model.Nasabah;

public interface NasabahDao {

	public void save(Nasabah nasabah);

	public void update(Nasabah nasabah);

	public void delete(int id);
}