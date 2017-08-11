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
@Table(name = "BANK_NASABAH")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class Nasabah {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(unique = true)
	private String noRek;
	private String nama;
	private String jenisIdentitas;
	@Column(unique = true)
	private String no_identitas;
	private String wargaNegara;
	private String alamat;
	private String tempatLahir;
	private String tanggalLahir;
	private String jenisKel;
	private String pekerjaan;
	private Double penghasilan;
	@Column(unique = true)
	private String npwp;
	private String rekomendasiPerusahaan;
	private String status;
	private String ahliWaris;
	@ManyToOne
	private Rekening rekening;
	@ManyToOne
	private ProdukNasabah produkNasabah;
	// Rekening (Many to One)
	// Keluarga (One to Many)
	// Produk (Many To One)

	public Nasabah() {
		// TODO Auto-generated constructor stub
	}

	public Nasabah(int id, String noRek, String nama, String jenisIdentitas, String no_identitas, String wargaNegara,
			String alamat, String tempatLahir, String tanggalLahir, String jenisKel, String pekerjaan,
			Double penghasilan, String npwp, String rekomendasiPerusahaan, String status, String ahliWaris,
			Rekening rekening, ProdukNasabah produkNasabah) {
		super();
		this.id = id;
		this.noRek = noRek;
		this.nama = nama;
		this.jenisIdentitas = jenisIdentitas;
		this.no_identitas = no_identitas;
		this.wargaNegara = wargaNegara;
		this.alamat = alamat;
		this.tempatLahir = tempatLahir;
		this.tanggalLahir = tanggalLahir;
		this.jenisKel = jenisKel;
		this.pekerjaan = pekerjaan;
		this.penghasilan = penghasilan;
		this.npwp = npwp;
		this.rekomendasiPerusahaan = rekomendasiPerusahaan;
		this.status = status;
		this.ahliWaris = ahliWaris;
		this.rekening = rekening;
		this.produkNasabah = produkNasabah;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNoRek() {
		return noRek;
	}

	public void setNoRek(String noRek) {
		this.noRek = noRek;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJenisIdentitas() {
		return jenisIdentitas;
	}

	public void setJenisIdentitas(String jenisIdentitas) {
		this.jenisIdentitas = jenisIdentitas;
	}

	public String getNo_identitas() {
		return no_identitas;
	}

	public void setNo_identitas(String no_identitas) {
		this.no_identitas = no_identitas;
	}

	public String getWargaNegara() {
		return wargaNegara;
	}

	public void setWargaNegara(String wargaNegara) {
		this.wargaNegara = wargaNegara;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getTempatLahir() {
		return tempatLahir;
	}

	public void setTempatLahir(String tempatLahir) {
		this.tempatLahir = tempatLahir;
	}

	public String getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public String getJenisKel() {
		return jenisKel;
	}

	public void setJenisKel(String jenisKel) {
		this.jenisKel = jenisKel;
	}

	public String getPekerjaan() {
		return pekerjaan;
	}

	public void setPekerjaan(String pekerjaan) {
		this.pekerjaan = pekerjaan;
	}

	public Double getPenghasilan() {
		return penghasilan;
	}

	public void setPenghasilan(Double penghasilan) {
		this.penghasilan = penghasilan;
	}

	public String getNpwp() {
		return npwp;
	}

	public void setNpwp(String npwp) {
		this.npwp = npwp;
	}

	public String getRekomendasiPerusahaan() {
		return rekomendasiPerusahaan;
	}

	public void setRekomendasiPerusahaan(String rekomendasiPerusahaan) {
		this.rekomendasiPerusahaan = rekomendasiPerusahaan;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAhliWaris() {
		return ahliWaris;
	}

	public void setAhliWaris(String ahliWaris) {
		this.ahliWaris = ahliWaris;
	}

	public Rekening getRekening() {
		return rekening;
	}

	public void setRekening(Rekening rekening) {
		this.rekening = rekening;
	}

	public ProdukNasabah getProdukNasabah() {
		return produkNasabah;
	}

	public void setProdukNasabah(ProdukNasabah produkNasabah) {
		this.produkNasabah = produkNasabah;
	}
}