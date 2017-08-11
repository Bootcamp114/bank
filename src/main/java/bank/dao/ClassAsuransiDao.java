package bank.dao;

import java.util.List;

import bank.model.ClassAsuransi;

public interface ClassAsuransiDao {
	
	
	public void save(ClassAsuransi classAsuransi);
	
	public void delete(int id);
	
	public void update(ClassAsuransi classAsuransi);
	
	public List<ClassAsuransi> getAllClassAsuransi();
	
	public ClassAsuransi getCLassAsuransiById(int id);

}
