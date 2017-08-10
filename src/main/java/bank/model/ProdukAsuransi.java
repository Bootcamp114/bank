package bank.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	private String kondisi_tunjangan_1;
	private String kondisi_tunjangan_2;
	private String kondisi_tunjangan_3;
	private String kondisi_tunjangan_4;
	private String kondisi_tunjangan_5;
	private String kondisi_tunjangan_6;
	private String kondisi_tunjangan_7;
	private String kondisi_tunjangan_8;
	private String kondisi_tunjangan_9;
	private String kondisi_tunjangan_10;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="produkAsuransi")
	private List<Polis>listPolis;
	
	public ProdukAsuransi(int id, String produk, String kondisi_tunjangan_1, String kondisi_tunjangan_2,
			String kondisi_tunjangan_3, String kondisi_tunjangan_4, String kondisi_tunjangan_5,
			String kondisi_tunjangan_6, String kondisi_tunjangan_7, String kondisi_tunjangan_8,
			String kondisi_tunjangan_9, String kondisi_tunjangan_10, List<Polis> listPolis) {
		super();
		this.id = id;
		this.produk = produk;
		this.kondisi_tunjangan_1 = kondisi_tunjangan_1;
		this.kondisi_tunjangan_2 = kondisi_tunjangan_2;
		this.kondisi_tunjangan_3 = kondisi_tunjangan_3;
		this.kondisi_tunjangan_4 = kondisi_tunjangan_4;
		this.kondisi_tunjangan_5 = kondisi_tunjangan_5;
		this.kondisi_tunjangan_6 = kondisi_tunjangan_6;
		this.kondisi_tunjangan_7 = kondisi_tunjangan_7;
		this.kondisi_tunjangan_8 = kondisi_tunjangan_8;
		this.kondisi_tunjangan_9 = kondisi_tunjangan_9;
		this.kondisi_tunjangan_10 = kondisi_tunjangan_10;
		this.listPolis = listPolis;
	}
	
	public ProdukAsuransi(){}

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

	public String getKondisi_tunjangan_1() {
		return kondisi_tunjangan_1;
	}

	public void setKondisi_tunjangan_1(String kondisi_tunjangan_1) {
		this.kondisi_tunjangan_1 = kondisi_tunjangan_1;
	}

	public String getKondisi_tunjangan_2() {
		return kondisi_tunjangan_2;
	}

	public void setKondisi_tunjangan_2(String kondisi_tunjangan_2) {
		this.kondisi_tunjangan_2 = kondisi_tunjangan_2;
	}

	public String getKondisi_tunjangan_3() {
		return kondisi_tunjangan_3;
	}

	public void setKondisi_tunjangan_3(String kondisi_tunjangan_3) {
		this.kondisi_tunjangan_3 = kondisi_tunjangan_3;
	}

	public String getKondisi_tunjangan_4() {
		return kondisi_tunjangan_4;
	}

	public void setKondisi_tunjangan_4(String kondisi_tunjangan_4) {
		this.kondisi_tunjangan_4 = kondisi_tunjangan_4;
	}

	public String getKondisi_tunjangan_5() {
		return kondisi_tunjangan_5;
	}

	public void setKondisi_tunjangan_5(String kondisi_tunjangan_5) {
		this.kondisi_tunjangan_5 = kondisi_tunjangan_5;
	}

	public String getKondisi_tunjangan_6() {
		return kondisi_tunjangan_6;
	}

	public void setKondisi_tunjangan_6(String kondisi_tunjangan_6) {
		this.kondisi_tunjangan_6 = kondisi_tunjangan_6;
	}

	public String getKondisi_tunjangan_7() {
		return kondisi_tunjangan_7;
	}

	public void setKondisi_tunjangan_7(String kondisi_tunjangan_7) {
		this.kondisi_tunjangan_7 = kondisi_tunjangan_7;
	}

	public String getKondisi_tunjangan_8() {
		return kondisi_tunjangan_8;
	}

	public void setKondisi_tunjangan_8(String kondisi_tunjangan_8) {
		this.kondisi_tunjangan_8 = kondisi_tunjangan_8;
	}

	public String getKondisi_tunjangan_9() {
		return kondisi_tunjangan_9;
	}

	public void setKondisi_tunjangan_9(String kondisi_tunjangan_9) {
		this.kondisi_tunjangan_9 = kondisi_tunjangan_9;
	}

	public String getKondisi_tunjangan_10() {
		return kondisi_tunjangan_10;
	}

	public void setKondisi_tunjangan_10(String kondisi_tunjangan_10) {
		this.kondisi_tunjangan_10 = kondisi_tunjangan_10;
	}

	public List<Polis> getListPolis() {
		return listPolis;
	}

	public void setListPolis(List<Polis> listPolis) {
		this.listPolis = listPolis;
	}
	
	
	
	
	
	
	

}
