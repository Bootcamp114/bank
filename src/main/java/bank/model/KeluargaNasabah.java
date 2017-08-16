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
@Table(name = "BANK_KELUARGA")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class KeluargaNasabah {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String nama;
	@Column(name = "hubungan_kel")
	private String hubunganKel;
	private int umur;
	private String pendidikan;
	@Column(name = "no_hp")
	private String noHp;
	@ManyToOne
	private Nasabah nasabah;

	public KeluargaNasabah() {
		// TODO Auto-generated constructor stub
	}

	public KeluargaNasabah(int id, String nama, String hubunganKel, int umur, String pendidikan, String noHp,
			Nasabah nasabah) {
		super();
		this.id = id;
		this.nama = nama;
		this.hubunganKel = hubunganKel;
		this.umur = umur;
		this.pendidikan = pendidikan;
		this.noHp = noHp;
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

	public String getHubunganKel() {
		return hubunganKel;
	}

	public void setHubunganKel(String hubunganKel) {
		this.hubunganKel = hubunganKel;
	}

	public int getUmur() {
		return umur;
	}

	public void setUmur(int umur) {
		this.umur = umur;
	}

	public String getPendidikan() {
		return pendidikan;
	}

	public void setPendidikan(String pendidikan) {
		this.pendidikan = pendidikan;
	}

	public String getNoHp() {
		return noHp;
	}

	public void setNoHp(String noHp) {
		this.noHp = noHp;
	}

	public Nasabah getNasabah() {
		return nasabah;
	}

	public void setNasabah(Nasabah nasabah) {
		this.nasabah = nasabah;
	}
}