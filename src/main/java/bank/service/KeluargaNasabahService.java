package bank.service;

import java.util.List;
import bank.model.KeluargaNasabah;

public interface KeluargaNasabahService {

	public void save(KeluargaNasabah keluargaNasabah);

	public void update(KeluargaNasabah keluargaNasabah);

	public void delete(int id);

	public List<KeluargaNasabah> getAllKeluargaNasabah();

	public KeluargaNasabah getKeluargaNasabahById(int id);
}