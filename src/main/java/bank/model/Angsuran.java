package bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BANK_ANGSURAN")
public class Angsuran {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private Double jumlah_pinjam;
	private String lama_pinjam;
	private String bunga_pinjam;
	
	public Angsuran() {
		// TODO Auto-generated constructor stub
	}

	public Angsuran(int id, Double jumlah_pinjam, String lama_pinjam, String bunga_pinjam) {
		super();
		this.id = id;
		this.jumlah_pinjam = jumlah_pinjam;
		this.lama_pinjam = lama_pinjam;
		this.bunga_pinjam = bunga_pinjam;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getJumlah_pinjam() {
		return jumlah_pinjam;
	}

	public void setJumlah_pinjam(Double jumlah_pinjam) {
		this.jumlah_pinjam = jumlah_pinjam;
	}

	public String getLama_pinjam() {
		return lama_pinjam;
	}

	public void setLama_pinjam(String lama_pinjam) {
		this.lama_pinjam = lama_pinjam;
	}

	public String getBunga_pinjam() {
		return bunga_pinjam;
	}

	public void setBunga_pinjam(String bunga_pinjam) {
		this.bunga_pinjam = bunga_pinjam;
	}
	
}
