package bank.model;

import java.util.List;

import javax.persistence.Column;
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
@Table(name="BANK_JUMLAH_SETORAN")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id")
public class JumlahStoran {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="jumlah_storan")
	private Double jumlahStoran;
	@Column(name="besar_tunjangan")
	private Double besarTunjangan;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="jenisStoran")
	private List<Polis> listPolis;
	
	public JumlahStoran(){
		
	}

	public JumlahStoran(int id, Double jumlahStoran, Double besarTunjangan, List<Polis> listPolis) {
		super();
		this.id = id;
		this.jumlahStoran = jumlahStoran;
		this.besarTunjangan = besarTunjangan;
		this.listPolis = listPolis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getJumlahStoran() {
		return jumlahStoran;
	}

	public void setJumlahStoran(Double jumlahStoran) {
		this.jumlahStoran = jumlahStoran;
	}

	public Double getBesarTunjangan() {
		return besarTunjangan;
	}

	public void setBesarTunjangan(Double besarTunjangan) {
		this.besarTunjangan = besarTunjangan;
	}

	public List<Polis> getListPolis() {
		return listPolis;
	}

	public void setListPolis(List<Polis> listPolis) {
		this.listPolis = listPolis;
	}
	
	
	
	
	
	

}
