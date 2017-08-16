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
	@Column(name="no_hp", unique = true)
	private String noHp;
	@Column(unique = true)
	private String email;
	private String username;
	private String password;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="employee")
	private List<PeminjamanDana> peminjamanDana;

	public Employee() {
		// TODO Auto-generated constructor stub
		
	}

	public Employee(int id, String nama, String alamat, String noHp, String email, String username, String password,
			List<PeminjamanDana> peminjamanDana) {
		super();
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.noHp = noHp;
		this.email = email;
		this.username = username;
		this.password = password;
		this.peminjamanDana = peminjamanDana;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<PeminjamanDana> getPeminjamanDana() {
		return peminjamanDana;
	}

	public void setPeminjamanDana(List<PeminjamanDana> peminjamanDana) {
		this.peminjamanDana = peminjamanDana;
	}

	
}