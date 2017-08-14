package bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="BANK_POLIS")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id")
public class Polis {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="no_polis")
	private int noPolis;
	@Column(name="nama_pemegang", nullable = false)
	private String namaPemegang;
	@Column(name="ahli_waris", nullable = false)
	private String ahliWaris;
	@Column(name="tanggal_dibuat", nullable = false)
	private String tanggalDibuat;
	@ManyToOne
	private ProdukAsuransi produkAsuransi;
	@ManyToOne
	private ClassAsuransi classAsuransi;
	@ManyToOne
	private JumlahStoran jumlahStoran;
	@OneToOne
	private InfoTertanggung infoTertanggung;
	@ManyToOne
	private Nasabah nasabah;
	@ManyToOne
	private Employee employee;
	
	public Polis(){
		
	}
	

	public Polis(int id, int noPolis, String namaPemegang, String ahliWaris, String tanggalDibuat,
			ProdukAsuransi produkAsuransi, ClassAsuransi classAsuransi, JumlahStoran jumlahStoran,
			InfoTertanggung infoTertanggung,Nasabah nasabah, Employee employee) {
		super();
		this.id = id;
		this.noPolis = noPolis;
		this.namaPemegang = namaPemegang;
		this.ahliWaris = ahliWaris;
		this.tanggalDibuat = tanggalDibuat;
		this.produkAsuransi = produkAsuransi;
		this.classAsuransi = classAsuransi;
		this.jumlahStoran = jumlahStoran;
		this.infoTertanggung = infoTertanggung;
		this.nasabah = nasabah;
		this.employee = employee;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoPolis() {
		return noPolis;
	}

	public void setNoPolis(int noPolis) {
		this.noPolis = noPolis;
	}

	public String getNamaPemegang() {
		return namaPemegang;
	}

	public void setNamaPemegang(String namaPemegang) {
		this.namaPemegang = namaPemegang;
	}

	public String getAhliWaris() {
		return ahliWaris;
	}

	public void setAhliWaris(String ahliWaris) {
		this.ahliWaris = ahliWaris;
	}

	public String getTanggalDibuat() {
		return tanggalDibuat;
	}

	public void setTanggalDibuat(String tanggalDibuat) {
		this.tanggalDibuat = tanggalDibuat;
	}

	public ProdukAsuransi getProdukAsuransi() {
		return produkAsuransi;
	}

	public void setProdukAsuransi(ProdukAsuransi produkAsuransi) {
		this.produkAsuransi = produkAsuransi;
	}

	public ClassAsuransi getClassAsuransi() {
		return classAsuransi;
	}

	public void setClassAsuransi(ClassAsuransi classAsuransi) {
		this.classAsuransi = classAsuransi;
	}

	public JumlahStoran getJumlahStoran() {
		return jumlahStoran;
	}

	public void setJumlahStoran(JumlahStoran jumlahStoran) {
		this.jumlahStoran = jumlahStoran;
	}

	public InfoTertanggung getInfoTertanggung() {
		return infoTertanggung;
	}

	public void setInfoTertanggung(InfoTertanggung infoTertanggung) {
		this.infoTertanggung = infoTertanggung;
	}
	

	public Nasabah getNasabah() {
		return nasabah;
	}


	public void setNasabah(Nasabah nasabah) {
		this.nasabah = nasabah;
	}
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	


}
