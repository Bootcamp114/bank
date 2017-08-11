package bank.model;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Controller
@Table(name = "BANK_REKENING")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class Rekening {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String rekening;
	private Double saldo;
	private Double harga;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rekening")
	private List<Nasabah> nasabah;
	// Nasabah (One To Many)

	public Rekening() {
		// TODO Auto-generated constructor stub
	}

	public Rekening(int id, String rekening, Double saldo, Double harga) {
		super();
		this.id = id;
		this.rekening = rekening;
		this.saldo = saldo;
		this.harga = harga;
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

	public Double getHarga() {
		return harga;
	}

	public void setHarga(Double harga) {
		this.harga = harga;
	}
}