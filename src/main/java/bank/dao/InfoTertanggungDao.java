package bank.dao;

import java.util.List;

import bank.model.InfoTertanggung;

public interface InfoTertanggungDao {
	
	public void save(InfoTertanggung infoTertanggung);
	
	public void delete(int id);
	
	public void update(InfoTertanggung infoTertanggung);
	
	public List<InfoTertanggung> getAllInfoTertanggung();
	
	public InfoTertanggung getInfoTertanggungById(int id);
}
