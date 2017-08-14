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
	private String nama;
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
	
	public PeminjamanDana(int id, String nama, String tujuanPenggunaan, Double jumlahPinjam, String lamaPinjam,
			String bungaBank, String jenisSukuBunga, String namaJaminan, String deskripsiJaminan,
			String fileBuktiJaminan, Nasabah nasabah) {
		super();
		this.id = id;
		this.nama = nama;
		this.tujuanPenggunaan = tujuanPenggunaan;
		this.jumlahPinjam = jumlahPinjam;
		this.lamaPinjam = lamaPinjam;
		this.bungaBank = bungaBank;
		this.jenisSukuBunga = jenisSukuBunga;
		this.namaJaminan = namaJaminan;
		this.deskripsiJaminan = deskripsiJaminan;
		this.fileBuktiJaminan = fileBuktiJaminan;
		this.nasabah = nasabah;
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

	public String getBungaBank() {
		return bungaBank;
	}

	public void setBungaBank(String bungaBank) {
		this.bungaBank = bungaBank;
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
	
	public Nasabah getNasabah() {
		return nasabah;
	}

	public void setNasabah(Nasabah nasabah) {
		this.nasabah = nasabah;
	}

	public PeminjamanDana() {
		// TODO Auto-generated constructor stub
	}
	
}