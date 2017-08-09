package bank.service;

import bank.model.Nasabah;

public interface NasabahService {

	public void save(Nasabah nasabah);

	public void update(Nasabah nasabah);

	public void delete(int id);
}