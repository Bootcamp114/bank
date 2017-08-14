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
@Table(name = "BANK_REKAM_PINJAM")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class RekamPinjam {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="tujuan_penggunaan")
	private String tujuanPenggunaan;
	@Column(name="jumlah_pinjam")
	private Double jumlahPinjam;
	@Column(name="lama_pinjam")
	private String lamaPinjam;
	@Column(name="bunga_pinjam")
	private String bungaPinjam;
	@Column(name="tanggal_pinjam")
	private String tanggalPinjam;
	@Column(name="jatuh_tempo")
	private String jatuhTempo;
	
	public RekamPinjam() {
		// TODO Auto-generated constructor stub
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

	public String getBungaPinjam() {
		return bungaPinjam;
	}

	public void setBungaPinjam(String bungaPinjam) {
		this.bungaPinjam = bungaPinjam;
	}

	public String getTanggalPinjam() {
		return tanggalPinjam;
	}

	public void setTanggalPinjam(String tanggalPinjam) {
		this.tanggalPinjam = tanggalPinjam;
	}

	public String getJatuhTempo() {
		return jatuhTempo;
	}

	public void setJatuhTempo(String jatuhTempo) {
		this.jatuhTempo = jatuhTempo;
	}

	public RekamPinjam(int id, String tujuanPenggunaan, Double jumlahPinjam, String lamaPinjam, String bungaPinjam,
			String tanggalPinjam, String jatuhTempo) {
		super();
		this.id = id;
		this.tujuanPenggunaan = tujuanPenggunaan;
		this.jumlahPinjam = jumlahPinjam;
		this.lamaPinjam = lamaPinjam;
		this.bungaPinjam = bungaPinjam;
		this.tanggalPinjam = tanggalPinjam;
		this.jatuhTempo = jatuhTempo;
	}
	
	
}
