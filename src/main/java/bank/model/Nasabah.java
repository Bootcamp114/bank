package bank.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BANK_NASABAH")
public class Nasabah {

	private int id;
	private int nomorKtp;
	private String nama;
	private String alamat;
	private String email;
	private String tempatLahir;
	private String tanggalLahir;
	private String telepon;
	private String jenisKelamin;
	private int nomorNpwp;
}
