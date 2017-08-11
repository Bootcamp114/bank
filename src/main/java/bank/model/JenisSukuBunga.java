package bank.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="BANK_JENIS_SUKU_BUNGA")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class JenisSukuBunga {

	private int id;
	private String jenis_suku_bunga;
	private Double bunga;
	
	public JenisSukuBunga(int id, String jenis_suku_bunga, Double bunga) {
		super();
		this.id = id;
		this.jenis_suku_bunga = jenis_suku_bunga;
		this.bunga = bunga;
	}
	
	public JenisSukuBunga() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJenis_suku_bunga() {
		return jenis_suku_bunga;
	}

	public void setJenis_suku_bunga(String jenis_suku_bunga) {
		this.jenis_suku_bunga = jenis_suku_bunga;
	}

	public Double getBunga() {
		return bunga;
	}

	public void setBunga(Double bunga) {
		this.bunga = bunga;
	}
	
}
