package bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/asuransi")
public class AsuransiController {
	
	@RequestMapping
	public String index(){
		return "Asuransi";
	}
	
	@RequestMapping("/add")
	public String index2(){
		return "AsuransiAdd";
	}

}
