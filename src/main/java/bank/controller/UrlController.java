package bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import bank.model.ClassAsuransi;
import bank.model.Employee;
import bank.model.KeluargaNasabah;
import bank.model.Nasabah;
import bank.model.PeminjamanDana;
import bank.model.Polis;
import bank.model.ProdukAsuransi;
import bank.model.ProdukNasabah;
import bank.model.Rekening;
import bank.service.ClassAsuransiService;
import bank.service.EmployeeService;
import bank.service.KeluargaNasabahService;
import bank.service.NasabahService;
import bank.service.PeminjamanDanaService;
import bank.service.PolisService;
import bank.service.ProdukAsuransiService;
import bank.service.ProdukNasabahService;
import bank.service.RekeningService;
import bank.utils.AppUtils;

@Controller
@RequestMapping("/bank")
public class UrlController {

	@Autowired
	NasabahService nasabahService;
	@Autowired
	private AppUtils appUtils;
	@Autowired
	ProdukNasabahService produkNasabahService;
	@Autowired
	RekeningService rekeningService;
	@Autowired
	KeluargaNasabahService keluargaNasabahService;
	@Autowired
	PeminjamanDanaService pinjamDnService;
	@Autowired
	EmployeeService employeeService;
	@Autowired
	ClassAsuransiService classAsuransiService;
	@Autowired
	ProdukAsuransiService produkAsuransiService;
	@Autowired
	PolisService polisService; 
	

	@RequestMapping("/login")
	public String login() {

		return "Login";
	}

	@RequestMapping("/index")
	public String index() {

		return "Dashboard";
	}

	@RequestMapping("/account")
	public String akun(Model model) {
		List<Nasabah> nasabah = nasabahService.getAllNasabah();
		model.addAttribute("nasabah", nasabah);
		return "Account";
	}

	@RequestMapping("/account/add")
	public String addakun(Model model) {
		List<ProdukNasabah> produkNasabah = produkNasabahService.getAllProdukNasabah();
		List<Rekening> rekening = rekeningService.getAllRekening();
		List<Employee> employee = employeeService.getAllEmployee();
		List<KeluargaNasabah> keluargaNasabah = keluargaNasabahService.getAllKeluargaNasabah();
		String noRek = appUtils.getNoRek();
		model.addAttribute("produkNasabah", produkNasabah);
		model.addAttribute("rekening", rekening);
		model.addAttribute("noRek", noRek);
		model.addAttribute("employee", employee);
		model.addAttribute("keluargaNasabah", keluargaNasabah);
		return "AccountAdd";
	}

	@RequestMapping("/produknasabah")
	public String produknasabah(Model model) {
		List<ProdukNasabah> produkNasabah = produkNasabahService.getAllProdukNasabah();
		model.addAttribute("produkNasabah", produkNasabah);
		return "ProdukNasabah";
	}

	@RequestMapping("/produknasabah/add")
	public String addproduknasabah() {

		return "ProdukNasabahAdd";
	}

	@RequestMapping("/rekening")
	public String rekening(Model model) {
		List<Rekening> rekening = rekeningService.getAllRekening();
		model.addAttribute("rekening", rekening);
		return "Rekening";
	}

	@RequestMapping("/rekening/add")
	public String addrekening() {

		return "RekeningAdd";
	}

	@RequestMapping("/karyawan")
	public String karyawan(Model model) {
		List<Employee> karyawan = employeeService.getAllEmployee();
		model.addAttribute("karyawan", karyawan);
		return "Karyawan";
	}

	@RequestMapping("/karyawan/add")
	public String tambahkaryawan() {

		return "TambahKaryawan";
	}

	@RequestMapping("/peminjamandana")
	public String pinjam(Model model) {
		List<PeminjamanDana> peminjamanDana = pinjamDnService.getAllPeminjamanDana();
		model.addAttribute("peminjamanDana", peminjamanDana);
		return "PeminjamanDana";
	}

	@RequestMapping("/peminjamandana/add")
	public String addpinjam(Model model) {
		List<Employee> employee = employeeService.getAllEmployee();
		model.addAttribute("employee", employee);
		List<Nasabah> nasabah = nasabahService.getAllNasabah();
		model.addAttribute("nasabah", nasabah);
		return "PeminjamanDanaAdd";
	}

	@RequestMapping("/peminjamandana/detail")
	public String detailpinjam() {

		return "PeminjamanDanaDetail";
	}

	@RequestMapping("/asuransi")
	public String ansuransi(Model model) {
		List<Polis> polis = polisService.getAllPolis();
		model.addAttribute("polis",polis);
		return "Asuransi";
	}

	@RequestMapping("/asuransi/add")
	public String addasuransi(Model model) {
		List<ClassAsuransi> classAsuransi = classAsuransiService.getAllClassAsuransi();
		List<ProdukAsuransi> produkAsuransi = produkAsuransiService.getAllProdkAsuransi();
		List<Employee> employee = employeeService.getAllEmployee();
		List<Nasabah> nasabah = nasabahService.getAllNasabah();
		
		String noPolis = appUtils.getNoPolis();
		model.addAttribute("classAsuransi", classAsuransi);
		model.addAttribute("produkAsuransi", produkAsuransi);
		model.addAttribute("employee", employee);
		model.addAttribute("nasabah", nasabah);
		model.addAttribute("noPolis", noPolis);
		return "AsuransiAdd";
	}
	

	@ResponseBody
	@RequestMapping(value="/getById/{id}",method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public ProdukAsuransi getProdukAsuransiById(@PathVariable int id){
		return produkAsuransiService.getProdukAsuransiById(id);
	}
	
	@ResponseBody
	@RequestMapping(value="/getbyid/{id}",method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public ClassAsuransi getClassAsuransiById(@PathVariable int id){
		return classAsuransiService.getClassAsuransiById(id);	
	}

	@RequestMapping("/classasuransi")
	public String classasuransi() {

		return "ClassAsuransi";
	}
}