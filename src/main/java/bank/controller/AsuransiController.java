package bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class AsuransiController {
	
	@RequestMapping("/asuransi")
	public String index(){
		return "Asuransi";
	}
	
	@RequestMapping("/asuransiadd")
	public String index2(){
		return "AsuransiAdd";
	}

}
