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
	@Column(name="kondisi_tunjungan_1")
	private String kondisiTunjangan1;
	@Column(name="kondisi_tunjungan_2")
	private String kondisiTunjangan2;
	@Column(name="kondisi_tunjungan_3")
	private String kondisiTunjangan3;
	@Column(name="kondisi_tunjungan_4")
	private String kondisiTunjangan4;
	@Column(name="kondisi_tunjungan_5")
	private String kondisiTunjangan5;
	@Column(name="kondisi_tunjungan_6")
	private String kondisiTunjangan6;
	@Column(name="kondisi_tunjungan_7")
	private String kondisiTunjangan7;
	@Column(name="kondisi_tunjungan_8")
	private String kondisiTunjangan8;
	@Column(name="kondisi_tunjungan_9")
	private String kondisiTunjangan9;
	@Column(name="kondisi_tunjungan_10")
	private String kondisiTunjangan10;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="produkAsuransi")
	private List<Polis>listPolis;

	public ProdukAsuransi(){
		
	}
	

	public ProdukAsuransi(int id, String produk, String kondisiTunjangan1, String kondisiTunjangan2,
			String kondisiTunjangan3, String kondisiTunjangan4, String kondisiTunjangan5, String kondisiTunjangan6,
			String kondisiTunjangan7, String kondisiTunjangan8, String kondisiTunjangan9, String kondisiTunjangan10,
			List<Polis> listPolis, Double jumlahDana) {
		super();
		this.id = id;
		this.produk = produk;
		this.jumlahDana = jumlahDana;
		this.kondisiTunjangan1 = kondisiTunjangan1;
		this.kondisiTunjangan2 = kondisiTunjangan2;
		this.kondisiTunjangan3 = kondisiTunjangan3;
		this.kondisiTunjangan4 = kondisiTunjangan4;
		this.kondisiTunjangan5 = kondisiTunjangan5;
		this.kondisiTunjangan6 = kondisiTunjangan6;
		this.kondisiTunjangan7 = kondisiTunjangan7;
		this.kondisiTunjangan8 = kondisiTunjangan8;
		this.kondisiTunjangan9 = kondisiTunjangan9;
		this.kondisiTunjangan10 = kondisiTunjangan10;
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

	public String getKondisiTunjangan1() {
		return kondisiTunjangan1;
	}

	public void setKondisiTunjangan1(String kondisiTunjangan1) {
		this.kondisiTunjangan1 = kondisiTunjangan1;
	}

	public String getKondisiTunjangan2() {
		return kondisiTunjangan2;
	}

	public void setKondisiTunjangan2(String kondisiTunjangan2) {
		this.kondisiTunjangan2 = kondisiTunjangan2;
	}

	public String getKondisiTunjangan3() {
		return kondisiTunjangan3;
	}

	public void setKondisiTunjangan3(String kondisiTunjangan3) {
		this.kondisiTunjangan3 = kondisiTunjangan3;
	}

	public String getKondisiTunjangan4() {
		return kondisiTunjangan4;
	}

	public void setKondisiTunjangan4(String kondisiTunjangan4) {
		this.kondisiTunjangan4 = kondisiTunjangan4;
	}

	public String getKondisiTunjangan5() {
		return kondisiTunjangan5;
	}

	public void setKondisiTunjangan5(String kondisiTunjangan5) {
		this.kondisiTunjangan5 = kondisiTunjangan5;
	}

	public String getKondisiTunjangan6() {
		return kondisiTunjangan6;
	}

	public void setKondisiTunjangan6(String kondisiTunjangan6) {
		this.kondisiTunjangan6 = kondisiTunjangan6;
	}

	public String getKondisiTunjangan7() {
		return kondisiTunjangan7;
	}

	public void setKondisiTunjangan7(String kondisiTunjangan7) {
		this.kondisiTunjangan7 = kondisiTunjangan7;
	}

	public String getKondisiTunjangan8() {
		return kondisiTunjangan8;
	}

	public void setKondisiTunjangan8(String kondisiTunjangan8) {
		this.kondisiTunjangan8 = kondisiTunjangan8;
	}

	public String getKondisiTunjangan9() {
		return kondisiTunjangan9;
	}

	public void setKondisiTunjangan9(String kondisiTunjangan9) {
		this.kondisiTunjangan9 = kondisiTunjangan9;
	}

	public String getKondisiTunjangan10() {
		return kondisiTunjangan10;
	}

	public void setKondisiTunjangan10(String kondisiTunjangan10) {
		this.kondisiTunjangan10 = kondisiTunjangan10;
	}

	public List<Polis> getListPolis() {
		return listPolis;
	}

	public void setListPolis(List<Polis> listPolis) {
		this.listPolis = listPolis;
	}
	
	public Double getJumlahDana() {
		return jumlahDana;
	}

	public void setJumlahDana(Double jumlahDana) {
		this.jumlahDana = jumlahDana;
	}



	
	
}