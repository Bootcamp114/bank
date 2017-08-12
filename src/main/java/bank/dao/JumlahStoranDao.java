package bank.dao;

import java.util.List;

import bank.model.JumlahStoran;

public interface JumlahStoranDao {
	
	public void save(JumlahStoran jumlahStroran);

	public void delete(int id);
	
	public void update(JumlahStoran jumlahStoran);
	
	public List<JumlahStoran> getAllJumlahStoran();
	
	public JumlahStoran getJumlahStoranById(int id);
}
