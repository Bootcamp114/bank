package bank.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="BANK_FILES")
public class MyFiles {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	@Column(name="the_files")
	private Blob file;
	@ManyToOne
	private PeminjamanDana peminjamanDana;

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Blob getFile() {
		return file;
	}


	public void setFile(Blob file) {
		this.file = file;
	}


	public PeminjamanDana getPeminjamanDana() {
		return peminjamanDana;
	}


	public void setPeminjamanDana(PeminjamanDana peminjamanDana) {
		this.peminjamanDana = peminjamanDana;
	}


	public MyFiles(int id, String name, Blob file, PeminjamanDana peminjamanDana) {
		super();
		this.id = id;
		this.name = name;
		this.file = file;
		this.peminjamanDana = peminjamanDana;
	}


	public MyFiles() {
		// TODO Auto-generated constructor stub
	}
		
}
