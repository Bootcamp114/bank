package bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bank.model.Nasabah;
import bank.model.PeminjamanDana;
import bank.model.ProdukNasabah;
import bank.model.Rekening;
import bank.service.NasabahService;
import bank.service.PeminjamanDanaService;
import bank.service.ProdukNasabahService;
import bank.service.RekeningService;

@Controller
@RequestMapping("/bank")
public class UrlController {

	@Autowired
	NasabahService nasabahService;
	@Autowired
	ProdukNasabahService produkNasabahService;
	@Autowired
	RekeningService rekeningService;
	@Autowired
	PeminjamanDanaService pinjamDnService;

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
		model.addAttribute("produkNasabah", produkNasabah);
		model.addAttribute("rekening", rekening);
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

	@RequestMapping("/peminjamandana")
	public String pinjam(Model model) {
		List<PeminjamanDana> peminjamanDana = pinjamDnService.getAllPeminjamanDana();
		model.addAttribute("peminjamanDana", peminjamanDana);
		return "PeminjamanDana";
	}

	@RequestMapping("/peminjamandana/add")
	public String addpinjam() {

		return "PeminjamanDanaAdd";
	}

	@RequestMapping("/peminjamandana/detail")
	public String detailpinjam() {

		return "PeminjamanDanaDetail";
	}

	@RequestMapping("/asuransi")
	public String ansuransi() {

		return "Asuransi";
	}

	@RequestMapping("/asuransi/add")
	public String addasuransi() {

		return "AsuransiAdd";
	}

	@RequestMapping("/classasuransi")
	public String classasuransi() {

		return "ClassAsuransi";
	}
}