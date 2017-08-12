package bank.service;

import java.util.List;

import bank.model.JumlahStoran;

public interface JumlahStoranService {
	
	public void save(JumlahStoran jumlahStoran);
	
	public void delete(int id);
	
	public void update(JumlahStoran jumlahStoran);
	
	public List<JumlahStoran> getAllJumlahStoran();
	
	public JumlahStoran getJumlahStoranById(int id);
	

}
