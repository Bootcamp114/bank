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
@Table(name = "BANK_KELUARGA")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class KeluargaNasabah {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String nama;
	@Column(name = "hub_kel")
	private String hubKel;
	private int umur;
	private String pendidikan;
	@Column(name = "no_hp")
	private String noHp;
	// Nasabah (Many To One)

	public KeluargaNasabah() {
		// TODO Auto-generated constructor stub
	}

	public KeluargaNasabah(int id, String nama, String hubKel, int umur, String pendidikan, String noHp) {
		super();
		this.id = id;
		this.nama = nama;
		this.hubKel = hubKel;
		this.umur = umur;
		this.pendidikan = pendidikan;
		this.noHp = noHp;
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

	public String getHubKel() {
		return hubKel;
	}

	public void setHubKel(String hubKel) {
		this.hubKel = hubKel;
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
}