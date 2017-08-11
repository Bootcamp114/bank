package bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="BANK_POLIS")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id")
public class Polis {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private int noPolis;
	@Column(name="namaPemegang", nullable = false)
	private String nama_pemegang;
	@Column(name="ahliWaris", nullable = false)
	private String ahliWaris;
	@Column(name="tanggalDibuat", nullable = false)
	private String tanggalDibuat;
	@ManyToOne
	private ProdukAsuransi produkAsuransi;
	@ManyToOne
	private ClassAsuransi classAsuransi;
	@ManyToOne
	private JenisStoran jenisStoran;
	@OneToOne
	private InfoTertanggung infoTertanggung;
	
	public Polis(){
		
	}

	public Polis(int id, int noPolis, String nama_pemegang, String ahliWaris, String tanggalDibuat,
			ProdukAsuransi produkAsuransi, ClassAsuransi classAsuransi, JenisStoran jenisStoran,
			InfoTertanggung infoTertanggung) {
		super();
		this.id = id;
		this.noPolis = noPolis;
		this.nama_pemegang = nama_pemegang;
		this.ahliWaris = ahliWaris;
		this.tanggalDibuat = tanggalDibuat;
		this.produkAsuransi = produkAsuransi;
		this.classAsuransi = classAsuransi;
		this.jenisStoran = jenisStoran;
		this.infoTertanggung = infoTertanggung;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoPolis() {
		return noPolis;
	}

	public void setNoPolis(int noPolis) {
		this.noPolis = noPolis;
	}

	public String getNama_pemegang() {
		return nama_pemegang;
	}

	public void setNama_pemegang(String nama_pemegang) {
		this.nama_pemegang = nama_pemegang;
	}

	public String getAhliWaris() {
		return ahliWaris;
	}

	public void setAhliWaris(String ahliWaris) {
		this.ahliWaris = ahliWaris;
	}

	public String getTanggalDibuat() {
		return tanggalDibuat;
	}

	public void setTanggalDibuat(String tanggalDibuat) {
		this.tanggalDibuat = tanggalDibuat;
	}

	public ProdukAsuransi getProdukAsuransi() {
		return produkAsuransi;
	}

	public void setProdukAsuransi(ProdukAsuransi produkAsuransi) {
		this.produkAsuransi = produkAsuransi;
	}

	public ClassAsuransi getClassAsuransi() {
		return classAsuransi;
	}

	public void setClassAsuransi(ClassAsuransi classAsuransi) {
		this.classAsuransi = classAsuransi;
	}

	public JenisStoran getJenisStoran() {
		return jenisStoran;
	}

	public void setJenisStoran(JenisStoran jenisStoran) {
		this.jenisStoran = jenisStoran;
	}

	public InfoTertanggung getInfoTertanggung() {
		return infoTertanggung;
	}

	public void setInfoTertanggung(InfoTertanggung infoTertanggung) {
		this.infoTertanggung = infoTertanggung;
	}
	
	
	
	
	
	
	
	
	
	

}
