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
@Table(name="BANK_DETAIL_PINJAM_DANA")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class PeminjamanDana {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="no_rek")
	private String noRek;
	private String nama;
	@Column(name="jenis_identitas")
	private String jenisIdentitas;
	@Column(name="no_identitas", unique = true)
	private String noIdentitas;
	@Column(name="warga_negara")
	private String wargaNegara;
	private String alamat;
	@Column(name="no_hp")
	private String noHp;
	private String email;
	@Column(name="tempat_lahir")
	private String tempatLahir;
	@Column(name="tanggal_lahir")
	private String tanggalLahir;
	@Column(name="jenis_kel")
	private String jenisKel;
	private String pekerjaan;
	private Double penghasilan;
	@Column(unique = true)
	private String npwp;
	@Column(name="rekomendasi_perusahaan")
	private String rekomendasiPerusahaan;
	private String status;
	@Column(name="ahli_waris")
	private String ahliWaris;
	@Column(name="tujuan_penggunaan")
	private String tujuanPenggunaan;
	@Column(name="jumlah_pinjam")
	private Double jumlahPinjam;
	@Column(name="lama_pinjam")
	private String lamaPinjam;
	@Column(name="bunga_bank")
	private String bungaBank;
	@Column(name="jenis_suku_bunga")
	private String jenisSukuBunga;
	@Column(name="nama_jaminan")
	private String namaJaminan;
	@Column(name="deskripsi_jaminan")
	private String deskripsiJaminan;
	@Column(name="file_bukti_jaminan")
	private String fileBuktiJaminan;
	@ManyToOne
	private Nasabah nasabah;
	
	public PeminjamanDana(int id, String noRek, String nama, String jenisIdentitas, String noIdentitas,
			String wargaNegara, String alamat, String tempatLahir, String tanggalLahir, String jenisKel,
			String pekerjaan, Double penghasilan, String npwp, String rekomendasiPerusahaan, String status,
			String ahliWaris, String tujuanPenggunaan, Double jumlahPinjam, String lamaPinjam, String jenisSukuBunga,
			String namaJaminan, String deskripsiJaminan, String fileBuktiJaminan) {
		super();
		this.id = id;
		this.noRek = noRek;
		this.nama = nama;
		this.jenisIdentitas = jenisIdentitas;
		this.noIdentitas = noIdentitas;
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
		this.tujuanPenggunaan = tujuanPenggunaan;
		this.jumlahPinjam = jumlahPinjam;
		this.lamaPinjam = lamaPinjam;
		this.jenisSukuBunga = jenisSukuBunga;
		this.namaJaminan = namaJaminan;
		this.deskripsiJaminan = deskripsiJaminan;
		this.fileBuktiJaminan = fileBuktiJaminan;
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

	public String getNoIdentitas() {
		return noIdentitas;
	}

	public void setNoIdentitas(String noIdentitas) {
		this.noIdentitas = noIdentitas;
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

	public String getTujuanPenggunaan() {
		return tujuanPenggunaan;
	}

	public void setTujuanPenggunaan(String tujuanPenggunaan) {
		this.tujuanPenggunaan = tujuanPenggunaan;
	}

	public Double getJumlahPinjam() {
		return jumlahPinjam;
	}

	public void setJumlahPinjam(Double jumlahPinjam) {
		this.jumlahPinjam = jumlahPinjam;
	}

	public String getLamaPinjam() {
		return lamaPinjam;
	}

	public void setLamaPinjam(String lamaPinjam) {
		this.lamaPinjam = lamaPinjam;
	}

	public String getJenisSukuBunga() {
		return jenisSukuBunga;
	}

	public void setJenisSukuBunga(String jenisSukuBunga) {
		this.jenisSukuBunga = jenisSukuBunga;
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

	public String getFileBuktiJaminan() {
		return fileBuktiJaminan;
	}

	public void setFileBuktiJaminan(String fileBuktiJaminan) {
		this.fileBuktiJaminan = fileBuktiJaminan;
	}
	
	public PeminjamanDana() {
		// TODO Auto-generated constructor stub
	}
}