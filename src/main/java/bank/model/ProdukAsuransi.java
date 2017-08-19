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
@Table(name="BANK_PRODUK_ASURANSI")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id")
public class ProdukAsuransi {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="produk", unique=true)
	private String produk;
	@Column(name="jumlah_dana")
	private Double jumlahDana;
	@Column (name="jumlah_storan")
	private int jumlahStoran;
	@Column(name="diskripsi_prosuk")
	private String diskripsiProduk;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="produkAsuransi")
	private List<Polis>listPolis;

	public ProdukAsuransi(){
		
	}

	public ProdukAsuransi(int id, String produk, Double jumlahDana, int jumlahStoran, String diskripsiProduk,
			List<Polis> listPolis) {
		super();
		this.id = id;
		this.produk = produk;
		this.jumlahDana = jumlahDana;
		this.jumlahStoran = jumlahStoran;
		this.diskripsiProduk = diskripsiProduk;
		this.listPolis = listPolis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduk() {
		return produk;
	}

	public void setProduk(String produk) {
		this.produk = produk;
	}

	public Double getJumlahDana() {
		return jumlahDana;
	}

	public void setJumlahDana(Double jumlahDana) {
		this.jumlahDana = jumlahDana;
	}

	public int getJumlahStoran() {
		return jumlahStoran;
	}

	public void setJumlahStoran(int jumlahStoran) {
		this.jumlahStoran = jumlahStoran;
	}

	public String getDiskripsiProduk() {
		return diskripsiProduk;
	}

	public void setDiskripsiProduk(String diskripsiProduk) {
		this.diskripsiProduk = diskripsiProduk;
	}

	public List<Polis> getListPolis() {
		return listPolis;
	}

	public void setListPolis(List<Polis> listPolis) {
		this.listPolis = listPolis;
	}


	}