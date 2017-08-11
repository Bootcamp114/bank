package bank.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="BANK_JENIS_KEGUNAAN")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class JenisJaminan {

	private int id;
	private String jenis_jaminan;
	private String dokumen_jaminan;
	
	public JenisJaminan(int id, String jenis_jaminan, String dokumen_jaminan) {
		super();
		this.id = id;
		this.jenis_jaminan = jenis_jaminan;
		this.dokumen_jaminan = dokumen_jaminan;
	}
	
	public JenisJaminan() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJenis_jaminan() {
		return jenis_jaminan;
	}

	public void setJenis_jaminan(String jenis_jaminan) {
		this.jenis_jaminan = jenis_jaminan;
	}

	public String getDokumen_jaminan() {
		return dokumen_jaminan;
	}

	public void setDokumen_jaminan(String dokumen_jaminan) {
		this.dokumen_jaminan = dokumen_jaminan;
	}
	
}
