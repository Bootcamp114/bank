package bank.dao;

import java.util.List;

import bank.model.Rekening;

public interface RekeningDao {

	public void save(Rekening rekening);

	public void update(Rekening rekening);

	public void delete(int id);

	public List<Rekening> getAllRekening();

	public Rekening getRekeningById(int id);
}