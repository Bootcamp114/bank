package bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import bank.model.Nasabah;
import bank.model.ProdukNasabah;
import bank.service.NasabahService;
import bank.service.ProdukNasabahService;

@Controller
@RequestMapping("/nasabah")
public class NasabahController {

	@Autowired
	NasabahService nasabahService;
	@Autowired
	ProdukNasabahService produkNasabahService;

	/* Nasabah */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void save(@RequestBody Nasabah nasabah) {
		nasabahService.save(nasabah);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable int id) {
		nasabahService.delete(id);
	}

	/* Produk Nasabah */
	@RequestMapping(value = "/produknasabah/save", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void saveproduk(@RequestBody ProdukNasabah produkNasabah) {
		produkNasabahService.save(produkNasabah);
	}

	@RequestMapping(value = "/produknasabah/delete/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void deleteproduk(@PathVariable int id) {
		produkNasabahService.delete(id);
	}
}