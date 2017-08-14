package bank.service;

import java.util.List;

import bank.model.Nasabah;

public interface NasabahService {

	public void save(Nasabah nasabah);

	public void update(Nasabah nasabah);

	public void delete(int id);

	public List<Nasabah> getAllNasabah();

	public Nasabah getNasbahById(int id);
}