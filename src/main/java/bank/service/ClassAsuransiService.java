package bank.service;

import java.util.List;

import bank.model.ClassAsuransi;

public interface ClassAsuransiService {
	
	public void save(ClassAsuransi classAsuransi);
	
	public void delete(int id);
	
	public void update(ClassAsuransi classAsuransi);
	
	public List<ClassAsuransi> getAllClassAsuransi();
	
	public ClassAsuransi getClassAsuransiById(int id);

}
