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
@Table(name="BANK_CLASS_ASURANSI")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id")
public class ClassAsuransi {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="type" , nullable=false)
	private String type;
	@Column(name="jenisPelayanan" , nullable=false)
	private String jenisPelayanan;
	@Column(name="jumlahDana" , nullable=false)
	private Double jumlahDana;
	@Column(name="hargaKartu" , nullable=false)
	private Double hargaKartu;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="classAsuransi")
	private List<Polis> listPolis;
	

	public ClassAsuransi(){
		
	}


	public ClassAsuransi(int id, String type, String jenisPelayanan, Double jumlahDana, Double hargaKartu,
			List<Polis> listPolis) {
		super();
		this.id = id;
		this.type = type;
		this.jenisPelayanan = jenisPelayanan;
		this.jumlahDana = jumlahDana;
		this.hargaKartu = hargaKartu;
		this.listPolis = listPolis;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getJenisPelayanan() {
		return jenisPelayanan;
	}


	public void setJenisPelayanan(String jenisPelayanan) {
		this.jenisPelayanan = jenisPelayanan;
	}


	public Double getJumlahDana() {
		return jumlahDana;
	}


	public void setJumlahDana(Double jumlahDana) {
		this.jumlahDana = jumlahDana;
	}


	public Double getHargaKartu() {
		return hargaKartu;
	}


	public void setHargaKartu(Double hargaKartu) {
		this.hargaKartu = hargaKartu;
	}


	public List<Polis> getListPolis() {
		return listPolis;
	}


	public void setListPolis(List<Polis> listPolis) {
		this.listPolis = listPolis;
	}
	
	
}