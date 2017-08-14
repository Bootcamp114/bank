package bank.dao;

import java.util.List;
import bank.model.Nasabah;

public interface NasabahDao {

	public void save(Nasabah nasabah);

	public void update(Nasabah nasabah);

	public void delete(int id);

	public List<Nasabah> getAllNasabah();

	public Nasabah getNasabahById(int id);
}