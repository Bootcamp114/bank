package bank.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BANK_INFO_TERTANGGUNG")
public class InfoTertanggung {
	
	private int id;
	private String nama;
	private int no_hp;
	private String email;
	private String tanggal_lahir;
	private String pekerjaan;
	private String alamat;
	private String jenis_kelamin;
	private String status;
	private String kewarganegaraan;
	@OneToOne
	private Polis polis;

}
