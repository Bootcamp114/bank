package bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bank.model.Nasabah;
import bank.service.NasabahService;

@Controller
@RequestMapping("/bank")
public class UrlController {

	@Autowired
	NasabahService nasabahService;

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
	public String addakun() {

		return "AccountAdd";
	}

	@RequestMapping("/peminjamandana")
	public String pinjam() {

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
	public String classasuransi(){
		
		return "ClassAsuransi";
	}
}