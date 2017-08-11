package bank.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="BANK_BUNGA_BANK")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class BungaBank {

	private int id;
	private String lama_pinjam;
	private Double bunga;
	
	public BungaBank(int id, String lama_pinjam, Double bunga) {
		super();
		this.id = id;
		this.lama_pinjam = lama_pinjam;
		this.bunga = bunga;
	}
	
	public BungaBank() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLama_pinjam() {
		return lama_pinjam;
	}

	public void setLama_pinjam(String lama_pinjam) {
		this.lama_pinjam = lama_pinjam;
	}

	public Double getBunga() {
		return bunga;
	}

	public void setBunga(Double bunga) {
		this.bunga = bunga;
	}
	
	
	
}
