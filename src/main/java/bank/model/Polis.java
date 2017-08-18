package bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="BANK_POLIS")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id")
public class Polis {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="no_polis")
	private int noPolis;
	@Column(name="ahli_waris")
	private String ahliWaris;
	@Column(name="tanggal_dibuat")
	private String tanggalDibuat;
	@Column(name="jumlah_storan")
	private int jumlahStoran;
	@Column(name="nama")
	private String nama;
	@Column(name="hubungan")
	private String hubungan;
	@Column(name="no_hp")
	private int noHp;
	@Column(name="email")
	private String email;
	@Column(name="tanggal_lahir")
	private String tanggalLahir;
	@Column(name="jenis_identitas")
	private String jenisIdentitas;
	@Column(name="no_identitas")
	private String noIdentitas;
	@Column(name="pekerjaan")
	private String pekerjaan;
	@Column(name="alamat")
	private String alamat;
	@Column(name="jenis_kelamin")
	private String jenisKelamin;
	@Column(name="status")
	private String status;
	@Column(name="kewarganagaraan")
	private String kewarganegaraan;
	@ManyToOne
	private ProdukAsuransi produkAsuransi;
	@ManyToOne
	private ClassAsuransi classAsuransi;
	@ManyToOne
	private Nasabah nasabah;
	@ManyToOne
	private Employee employee;
	
	public Polis(){
		
	}
	
	public Polis(int id, int noPolis, String ahliWaris, String tanggalDibuat, String nama, String hubungan, int noHp,
			String email, String tanggalLahir, String jenisIdentitas, String noIdentitas, String pekerjaan,
			String alamat, String jenisKelamin, String status, String kewarganegaraan, ProdukAsuransi produkAsuransi,
			ClassAsuransi classAsuransi, Nasabah nasabah, Employee employee, int jumlahStoran) {
		super();
		this.id = id;
		this.noPolis = noPolis;
		this.ahliWaris = ahliWaris;
		this.tanggalDibuat = tanggalDibuat;
		this.jumlahStoran = jumlahStoran;
		this.nama = nama;
		this.hubungan = hubungan;
		this.noHp = noHp;
		this.email = email;
		this.tanggalLahir = tanggalLahir;
		this.jenisIdentitas = jenisIdentitas;
		this.noIdentitas = noIdentitas;
		this.pekerjaan = pekerjaan;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.status = status;
		this.kewarganegaraan = kewarganegaraan;
		this.produkAsuransi = produkAsuransi;
		this.classAsuransi = classAsuransi;
		this.nasabah = nasabah;
		this.employee = employee;
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

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getHubungan() {
		return hubungan;
	}

	public void setHubungan(String hubungan) {
		this.hubungan = hubungan;
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

	public String getJenisIdentitas() {
		return jenisIdentitas;
	}

	public void setJenisIdentitas(String jenisIdentitas) {
		this.jenisIdentitas = jenisIdentitas;
	}

	public String getNoIdentitas() {
		return noIdentitas;
	}

	public void setNoIdentitas(String noIdentitas) {
		this.noIdentitas = noIdentitas;
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


	public Nasabah getNasabah() {
		return nasabah;
	}

	public void setNasabah(Nasabah nasabah) {
		this.nasabah = nasabah;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getJumlahStoran() {
		return jumlahStoran;
	}
	public void setJumlahStoran(int jumlahStoran) {
		this.jumlahStoran = jumlahStoran;
	}

}
