package bank.model;

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
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String nama;
	private String hub_kel;
	private int umur;
	private String pendidikan;
	// Nasabah (Many To One)

	public KeluargaNasabah() {
		// TODO Auto-generated constructor stub
	}

	public KeluargaNasabah(int id, String nama, String hub_kel, int umur, String pendidikan) {
		super();
		this.id = id;
		this.nama = nama;
		this.hub_kel = hub_kel;
		this.umur = umur;
		this.pendidikan = pendidikan;
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

	public String getHub_kel() {
		return hub_kel;
	}

	public void setHub_kel(String hub_kel) {
		this.hub_kel = hub_kel;
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
}