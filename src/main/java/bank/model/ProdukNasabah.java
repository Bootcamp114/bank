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
@Table(name = "BANK_PRODUK_NASABAH")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class ProdukNasabah {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String namaProduk;
	private Double harga;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produkNasabah")
	private List<Nasabah> nasabah;
	// Nasabah (One To Many)

	public ProdukNasabah() {
		// TODO Auto-generated constructor stub
	}

	public ProdukNasabah(int id, String namaProduk, Double harga) {
		super();
		this.id = id;
		this.namaProduk = namaProduk;
		this.harga = harga;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamaProduk() {
		return namaProduk;
	}

	public void setNamaProduk(String namaProduk) {
		this.namaProduk = namaProduk;
	}

	public Double getHarga() {
		return harga;
	}

	public void setHarga(Double harga) {
		this.harga = harga;
	}
}