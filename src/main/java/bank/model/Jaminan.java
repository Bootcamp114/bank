package bank.model;

import javax.persistence.Column;
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
	@Column(name="nama_jaminan")
	private String namaJaminan;
	@Column(name="deskripsi_jaminan")
	private String deskripsiJaminan;
	@Column(name="file_bukti_dokumen")
	private String fileBuktiDokumen;
	
	public Jaminan() {
		// TODO Auto-generated constructor stub
	}

	public Jaminan(int id, String namaJaminan, String deskripsiJaminan, String fileBuktiDokumen) {
		super();
		this.id = id;
		this.namaJaminan = namaJaminan;
		this.deskripsiJaminan = deskripsiJaminan;
		this.fileBuktiDokumen = fileBuktiDokumen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamaJaminan() {
		return namaJaminan;
	}

	public void setNamaJaminan(String namaJaminan) {
		this.namaJaminan = namaJaminan;
	}

	public String getDeskripsiJaminan() {
		return deskripsiJaminan;
	}

	public void setDeskripsiJaminan(String deskripsiJaminan) {
		this.deskripsiJaminan = deskripsiJaminan;
	}

	public String getFileBuktiDokumen() {
		return fileBuktiDokumen;
	}

	public void setFileBuktiDokumen(String fileBuktiDokumen) {
		this.fileBuktiDokumen = fileBuktiDokumen;
	}
	
}
