package bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import bank.model.PeminjamanDana;
import bank.service.PeminjamanDanaService;

@Controller
@RequestMapping("/peminjamandana")
public class PeminjamanDanaController {
	
	@Autowired
	PeminjamanDanaService pinjamDnService;

	@ResponseBody
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public PeminjamanDana save(@RequestBody PeminjamanDana pinjamdn) {
		pinjamDnService.save(pinjamdn);
		return pinjamdn;
	}
}