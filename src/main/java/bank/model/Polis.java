package bank.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Controller
@Table(name="BANK_POLIS")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id")
public class Polis {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private int no_polis;
	@Column(name="nama_pemegang", nullable = false)
	private String nama_pemegang;
	@Column(name="ahli_waris", nullable = false)
	private String ahli_waris;
	@Column(name="tanggal_dibuat", nullable = false)
	private String tanggal_dibuat;
	@ManyToOne
	private ProdukAsuransi produkAsuransi;
	@ManyToOne
	private ClassAsuransi classAsuransi;
	@ManyToOne
	private JenisStoran jenisStoran;
	@OneToOne
	private InfoTertanggung infoTertanggung;
	
	
	
	
	
	
	
	

}
