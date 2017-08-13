package bank.service;

import java.util.List;

import bank.model.Polis;

public interface PolisService {
	
	public void save(Polis polis);
	
	public void delete(int id);
	
	public void update(Polis polis);

	public List<Polis> getAllPolis();
	
	public Polis getPolisById(int id);
}
