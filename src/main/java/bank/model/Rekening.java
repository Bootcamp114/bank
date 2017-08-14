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
@Table(name = "BANK_REKENING")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class Rekening {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String rekening;
	private Double saldo;
	@Column(name = "administrasi_bulanan")
	private Double administrasiBulanan;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rekening")
	private List<Nasabah> nasabah;
	// Nasabah (One To Many)

	public Rekening() {
		// TODO Auto-generated constructor stub
	}

	public Rekening(int id, String rekening, Double saldo, Double administrasiBulanan, List<Nasabah> nasabah) {
		super();
		this.id = id;
		this.rekening = rekening;
		this.saldo = saldo;
		this.administrasiBulanan = administrasiBulanan;
		this.nasabah = nasabah;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRekening() {
		return rekening;
	}

	public void setRekening(String rekening) {
		this.rekening = rekening;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getAdministrasiBulanan() {
		return administrasiBulanan;
	}

	public void setAdministrasiBulanan(Double administrasiBulanan) {
		this.administrasiBulanan = administrasiBulanan;
	}

	public List<Nasabah> getNasabah() {
		return nasabah;
	}

	public void setNasabah(List<Nasabah> nasabah) {
		this.nasabah = nasabah;
	}
}