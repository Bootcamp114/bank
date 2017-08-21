package bank.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "BANK_EMPLOYEE")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String nama;
	private String alamat;
	@Column(name = "no_hp", unique = true)
	private String noHp;
	@Column(unique = true)
	private String email;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	private List<Nasabah> nasabah;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	private List<PeminjamanDana> peminjamanDana;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	private List<Polis> listPolis;

	public Employee() {
		// TODO Auto-generated constructor stub

	}

	public Employee(int id, String nama, String alamat, String noHp, String email, List<Nasabah> nasabah,
			List<PeminjamanDana> peminjamanDana, List<Polis> listPolis) {
		super();
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.noHp = noHp;
		this.email = email;
		this.nasabah = nasabah;
		this.peminjamanDana = peminjamanDana;
		this.listPolis = listPolis;
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

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNoHp() {
		return noHp;
	}

	public void setNoHp(String noHp) {
		this.noHp = noHp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Nasabah> getNasabah() {
		return nasabah;
	}

	public void setNasabah(List<Nasabah> nasabah) {
		this.nasabah = nasabah;
	}

	public List<PeminjamanDana> getPeminjamanDana() {
		return peminjamanDana;
	}

	public void setPeminjamanDana(List<PeminjamanDana> peminjamanDana) {
		this.peminjamanDana = peminjamanDana;
	}

	public List<Polis> getListPolis() {
		return listPolis;
	}

	public void setListPolis(List<Polis> listPolis) {
		this.listPolis = listPolis;
	}
}