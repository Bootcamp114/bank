package bank.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="BANK_JENIS_SETORAN")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id")
public class JenisStoran {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private Double jumlah_storan;
	private Double besar_tunjangan;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="jenisStoran")
	private List<Polis> listPolis;
	
	public JenisStoran(int id, Double jumlah_storan, Double besar_tunjangan, List<Polis> listPolis) {
		super();
		this.id = id;
		this.jumlah_storan = jumlah_storan;
		this.besar_tunjangan = besar_tunjangan;
		this.listPolis = listPolis;
	}
	
	public JenisStoran(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getJumlah_storan() {
		return jumlah_storan;
	}

	public void setJumlah_storan(Double jumlah_storan) {
		this.jumlah_storan = jumlah_storan;
	}

	public Double getBesar_tunjangan() {
		return besar_tunjangan;
	}

	public void setBesar_tunjangan(Double besar_tunjangan) {
		this.besar_tunjangan = besar_tunjangan;
	}

	public List<Polis> getListPolis() {
		return listPolis;
	}

	public void setListPolis(List<Polis> listPolis) {
		this.listPolis = listPolis;
	}
	
	
	
	

}
