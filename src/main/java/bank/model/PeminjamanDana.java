package bank.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@Column(name="tujuan_penggunaan")
	private String tujuanPenggunaan;
	@Column(name="jumlah_pinjam")
	private Double jumlahPinjam;
	@Column(name="lama_pinjam")
	private String lamaPinjam;
	@Column(name="bunga_bank")
	private String bungaBank;
	@Column(name="tanggal_pinjam")
	private String tanggalPinjam;
	@Column(name="angsuran_bunga")
	private Double angsuranBunga;
	@Column(name="angsuran_pokok")
	private Double angsuranPokok;
	@Column(name="total_angsuran")
	private Double totalAngsuran;
	@Column(name="jatuh_tempo")
	private String jatuhTempo;
	@Column(name="nama_jaminan")
	private String namaJaminan;
	@Column(name="deskripsi_jaminan")
	private String deskripsiJaminan;
	@Column(name="file_bukti_jaminan")
	private String fileBuktiJaminan;
	@ManyToOne
	private Nasabah nasabah;
	@ManyToOne
	private Employee employee;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="peminjamanDana")
	private List<MyFiles> myFiles;

	public PeminjamanDana() {
		// TODO Auto-generated constructor stub
	}

	public PeminjamanDana(int id, String tujuanPenggunaan, Double jumlahPinjam, String lamaPinjam, String bungaBank,
			String tanggalPinjam, Double angsuranBunga, Double angsuranPokok, Double totalAngsuran, String jatuhTempo,
			String namaJaminan, String deskripsiJaminan, String fileBuktiJaminan, Nasabah nasabah, Employee employee,
			List<MyFiles> myFiles) {
		super();
		this.id = id;
		this.tujuanPenggunaan = tujuanPenggunaan;
		this.jumlahPinjam = jumlahPinjam;
		this.lamaPinjam = lamaPinjam;
		this.bungaBank = bungaBank;
		this.tanggalPinjam = tanggalPinjam;
		this.angsuranBunga = angsuranBunga;
		this.angsuranPokok = angsuranPokok;
		this.totalAngsuran = totalAngsuran;
		this.jatuhTempo = jatuhTempo;
		this.namaJaminan = namaJaminan;
		this.deskripsiJaminan = deskripsiJaminan;
		this.fileBuktiJaminan = fileBuktiJaminan;
		this.nasabah = nasabah;
		this.employee = employee;
		this.myFiles = myFiles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getTanggalPinjam() {
		return tanggalPinjam;
	}

	public void setTanggalPinjam(String tanggalPinjam) {
		this.tanggalPinjam = tanggalPinjam;
	}

	public Double getAngsuranBunga() {
		return angsuranBunga;
	}

	public void setAngsuranBunga(Double angsuranBunga) {
		this.angsuranBunga = angsuranBunga;
	}

	public Double getAngsuranPokok() {
		return angsuranPokok;
	}

	public void setAngsuranPokok(Double angsuranPokok) {
		this.angsuranPokok = angsuranPokok;
	}

	public Double getTotalAngsuran() {
		return totalAngsuran;
	}

	public void setTotalAngsuran(Double totalAngsuran) {
		this.totalAngsuran = totalAngsuran;
	}

	public String getJatuhTempo() {
		return jatuhTempo;
	}

	public void setJatuhTempo(String jatuhTempo) {
		this.jatuhTempo = jatuhTempo;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public List<MyFiles> getMyFiles() {
		return myFiles;
	}

	public void setMyFiles(List<MyFiles> myFiles) {
		this.myFiles = myFiles;
	}
}