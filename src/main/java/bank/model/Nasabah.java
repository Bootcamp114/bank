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
@Table(name = "BANK_NASABAH")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class Nasabah {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(unique = true)
	private String no_rek;
	private String nama;
	private String jenis_identitas;
	@Column(unique = true)
	private String no_identitas;
	private String warga_negara;
	private String alamat;
	private String tempat_lahir;
	private String tanggal_lahir;
	private String jenis_kel;
	private String pekerjaan;
	private Double penghasilan;
	@Column(unique = true)
	private String npwp;
	private String rekomendasi_perusahaan;
	private String status;
	private String ahli_waris;
	// Rekening (Many to One)
	// saudara (One to one)
	// Produk (Many To One)

	public Nasabah() {
		// TODO Auto-generated constructor stub
	}

	public Nasabah(int id, String no_rek, String nama, String jenis_identitas, String no_identitas, String warga_negara,
			String alamat, String tempat_lahir, String tanggal_lahir, String jenis_kel, String pekerjaan,
			Double penghasilan, String npwp, String rekomendasi_perusahaan, String status, String ahli_waris) {
		super();
		this.id = id;
		this.no_rek = no_rek;
		this.nama = nama;
		this.jenis_identitas = jenis_identitas;
		this.no_identitas = no_identitas;
		this.warga_negara = warga_negara;
		this.alamat = alamat;
		this.tempat_lahir = tempat_lahir;
		this.tanggal_lahir = tanggal_lahir;
		this.jenis_kel = jenis_kel;
		this.pekerjaan = pekerjaan;
		this.penghasilan = penghasilan;
		this.npwp = npwp;
		this.rekomendasi_perusahaan = rekomendasi_perusahaan;
		this.status = status;
		this.ahli_waris = ahli_waris;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNo_rek() {
		return no_rek;
	}

	public void setNo_rek(String no_rek) {
		this.no_rek = no_rek;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJenis_identitas() {
		return jenis_identitas;
	}

	public void setJenis_identitas(String jenis_identitas) {
		this.jenis_identitas = jenis_identitas;
	}

	public String getNo_identitas() {
		return no_identitas;
	}

	public void setNo_identitas(String no_identitas) {
		this.no_identitas = no_identitas;
	}

	public String getWarga_negara() {
		return warga_negara;
	}

	public void setWarga_negara(String warga_negara) {
		this.warga_negara = warga_negara;
	}

	public String getTempat_lahir() {
		return tempat_lahir;
	}

	public void setTempat_lahir(String tempat_lahir) {
		this.tempat_lahir = tempat_lahir;
	}

	public String getTanggal_lahir() {
		return tanggal_lahir;
	}

	public void setTanggal_lahir(String tanggal_lahir) {
		this.tanggal_lahir = tanggal_lahir;
	}

	public String getJenis_kel() {
		return jenis_kel;
	}

	public void setJenis_kel(String jenis_kel) {
		this.jenis_kel = jenis_kel;
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

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getRekomendasi_perusahaan() {
		return rekomendasi_perusahaan;
	}

	public void setRekomendasi_perusahaan(String rekomendasi_perusahaan) {
		this.rekomendasi_perusahaan = rekomendasi_perusahaan;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAhli_waris() {
		return ahli_waris;
	}

	public void setAhli_waris(String ahli_waris) {
		this.ahli_waris = ahli_waris;
	}
}