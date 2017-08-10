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
	@Column(name="jenis_pelayanan" , nullable=false)
	private String jenis_pelayanan;
	@Column(name="jumlah_dana" , nullable=false)
	private Double jumlah_dana;
	@Column(name="harga_kartu" , nullable=false)
	private Double harga_kartu;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="classAsuransi")
	private List<Polis> listPolis;
	
	public ClassAsuransi(int id, String type, String jenis_pelayanan, Double jumlah_dana, Double harga_kartu,
			List<Polis> listPolis) {
		super();
		this.id = id;
		this.type = type;
		this.jenis_pelayanan = jenis_pelayanan;
		this.jumlah_dana = jumlah_dana;
		this.harga_kartu = harga_kartu;
		this.listPolis = listPolis;
	}
	
	public ClassAsuransi(){}

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

	public String getJenis_pelayanan() {
		return jenis_pelayanan;
	}

	public void setJenis_pelayanan(String jenis_pelayanan) {
		this.jenis_pelayanan = jenis_pelayanan;
	}

	public Double getJumlah_dana() {
		return jumlah_dana;
	}

	public void setJumlah_dana(Double jumlah_dana) {
		this.jumlah_dana = jumlah_dana;
	}

	public Double getHarga_kartu() {
		return harga_kartu;
	}

	public void setHarga_kartu(Double harga_kartu) {
		this.harga_kartu = harga_kartu;
	}

	public List<Polis> getListPolis() {
		return listPolis;
	}

	public void setListPolis(List<Polis> listPolis) {
		this.listPolis = listPolis;
	}
	
	
	
	
	
	
	
	
	

}
