package bank.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "BANK_JAMINAN")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Jaminan {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String jenis_jaminan;
	private String dokumen_jaminan;
	private String file_dokumen;
	
	public Jaminan() {
		// TODO Auto-generated constructor stub
	}

	public Jaminan(int id, String jenis_jaminan, String dokumen_jaminan, String file_dokumen) {
		super();
		this.id = id;
		this.jenis_jaminan = jenis_jaminan;
		this.dokumen_jaminan = dokumen_jaminan;
		this.file_dokumen = file_dokumen;
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

	public String getFile_dokumen() {
		return file_dokumen;
	}

	public void setFile_dokumen(String file_dokumen) {
		this.file_dokumen = file_dokumen;
	}
	
}
