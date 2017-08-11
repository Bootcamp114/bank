package bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bank")
public class UrlController {

	@RequestMapping("/login")
	public String login() {

		return "Login";
	}

	@RequestMapping("/index")
	public String index() {

		return "Dashboard";
	}

	@RequestMapping("/account")
	public String akun() {

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

	@RequestMapping("asuransi")
	public String ansuransi() {

		return "Asuransi";
	}

	@RequestMapping("asuransi/add")
	public String addasuransi() {

		return "AsuransiAdd";
	}
}