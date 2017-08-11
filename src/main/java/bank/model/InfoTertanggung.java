package bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="BANK_INFO_TERTANGGUNG")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class InfoTertanggung {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="nama", nullable = false)
	private String nama;
	@Column(name="no_hp", nullable = false)
	private int noHp;
	@Column(name="email", nullable = false, unique=true)
	private String email;
	@Column(name="tanggal_lahir", nullable = false)
	private String tanggalLahir;
	@Column(name="pekerjaan", nullable = false)
	private String pekerjaan;
	@Column(name="alamat", nullable = false)
	private String alamat;
	@Column(name="jenis_kelamin", nullable = false)
	private String jenisKelamin;
	@Column(name="status", nullable = false)
	private String status;
	@Column(name="kewarganagaraan", nullable = false)
	private String kewarganegaraan;
	@OneToOne(fetch=FetchType.LAZY,mappedBy="infoTertanggung")
	private Polis polis;
	
	public InfoTertanggung(){
		
	}

	public InfoTertanggung(int id, String nama, int noHp, String email, String tanggalLahir, String pekerjaan,
			String alamat, String jenisKelamin, String status, String kewarganegaraan, Polis polis) {
		super();
		this.id = id;
		this.nama = nama;
		this.noHp = noHp;
		this.email = email;
		this.tanggalLahir = tanggalLahir;
		this.pekerjaan = pekerjaan;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.status = status;
		this.kewarganegaraan = kewarganegaraan;
		this.polis = polis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getNoHp() {
		return noHp;
	}

	public void setNoHp(int noHp) {
		this.noHp = noHp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public String getPekerjaan() {
		return pekerjaan;
	}

	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getKewarganegaraan() {
		return kewarganegaraan;
	}

	public void setKewarganegaraan(String kewarganegaraan) {
		this.kewarganegaraan = kewarganegaraan;
	}

	public Polis getPolis() {
		return polis;
	}

	public void setPolis(Polis polis) {
		this.polis = polis;
	}
	
	
	

}
