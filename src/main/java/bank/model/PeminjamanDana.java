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
@Table(name="BANK_DETAIL_PINJAM_DANA")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class PeminjamanDana {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
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
	private String tujuan_penggunaan;
	private String jenis_kredit;
	private Double jumlah_pinjam;
	private String lama_pinjam;
	private String jenis_suku_bunga;
	private String jenis_jaminan;
	private String jenis_dokumen;
	private String file_dokumen;
	
	public PeminjamanDana(int id, String no_rek, String nama, String jenis_identitas, String no_identitas,
			String warga_negara, String alamat, String tempat_lahir, String tanggal_lahir, String jenis_kel,
			String pekerjaan, Double penghasilan, String npwp, String rekomendasi_perusahaan, String status,
			String ahli_waris, String tujuan_penggunaan, String jenis_kredit, Double jumlah_pinjam, String lama_pinjam,
			String jenis_suku_bunga, String jenis_jaminan, String jenis_dokumen, String file_dokumen) {
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
		this.tujuan_penggunaan = tujuan_penggunaan;
		this.jenis_kredit = jenis_kredit;
		this.jumlah_pinjam = jumlah_pinjam;
		this.lama_pinjam = lama_pinjam;
		this.jenis_suku_bunga = jenis_suku_bunga;
		this.jenis_jaminan = jenis_jaminan;
		this.jenis_dokumen = jenis_dokumen;
		this.file_dokumen = file_dokumen;
	}
	
	public PeminjamanDana() {
		// TODO Auto-generated constructor stub
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

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
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

	public String getTujuan_penggunaan() {
		return tujuan_penggunaan;
	}

	public void setTujuan_penggunaan(String tujuan_penggunaan) {
		this.tujuan_penggunaan = tujuan_penggunaan;
	}

	public String getJenis_kredit() {
		return jenis_kredit;
	}

	public void setJenis_kredit(String jenis_kredit) {
		this.jenis_kredit = jenis_kredit;
	}

	public Double getJumlah_pinjam() {
		return jumlah_pinjam;
	}

	public void setJumlah_pinjam(Double jumlah_pinjam) {
		this.jumlah_pinjam = jumlah_pinjam;
	}

	public String getLama_pinjam() {
		return lama_pinjam;
	}

	public void setLama_pinjam(String lama_pinjam) {
		this.lama_pinjam = lama_pinjam;
	}

	public String getJenis_suku_bunga() {
		return jenis_suku_bunga;
	}

	public void setJenis_suku_bunga(String jenis_suku_bunga) {
		this.jenis_suku_bunga = jenis_suku_bunga;
	}

	public String getJenis_jaminan() {
		return jenis_jaminan;
	}

	public void setJenis_jaminan(String jenis_jaminan) {
		this.jenis_jaminan = jenis_jaminan;
	}

	public String getJenis_dokumen() {
		return jenis_dokumen;
	}

	public void setJenis_dokumen(String jenis_dokumen) {
		this.jenis_dokumen = jenis_dokumen;
	}

	public String getFile_dokumen() {
		return file_dokumen;
	}

	public void setFile_dokumen(String file_dokumen) {
		this.file_dokumen = file_dokumen;
	}
	
}