package bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/peminjamandana")
public class PeminjamanDanaController {

	public String index() {
		return "PeminjamanDana";
	}
}
