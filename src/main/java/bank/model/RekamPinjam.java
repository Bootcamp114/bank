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
	@Column(name="jenis_bunga_pinjam")
	private String jenisBungaPinjam;
	
	public RekamPinjam() {
		// TODO Auto-generated constructor stub
	}
	
	public RekamPinjam(int id, Double jumlahPinjam, String lamaPinjam, String bungaPinjam, String jenisBungaPinjam) {
		super();
		this.id = id;
		this.jumlahPinjam = jumlahPinjam;
		this.lamaPinjam = lamaPinjam;
		this.bungaPinjam = bungaPinjam;
		this.jenisBungaPinjam = jenisBungaPinjam;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getJenisBungaPinjam() {
		return jenisBungaPinjam;
	}

	public void setJenisBungaPinjam(String jenisBungaPinjam) {
		this.jenisBungaPinjam = jenisBungaPinjam;
	}
	
}
