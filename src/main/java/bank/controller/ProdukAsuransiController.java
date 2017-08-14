package bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import bank.model.ProdukAsuransi;
import bank.service.ProdukAsuransiService;

@Controller
@RequestMapping(value="/produkasuransicontroller")
public class ProdukAsuransiController {
	
	@Autowired
	ProdukAsuransiService produkAsuransiService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public void save(@RequestBody ProdukAsuransi produkAsuransi){
		produkAsuransiService.save(produkAsuransi);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(value=HttpStatus.OK)
	public void delete(@PathVariable int id){
		produkAsuransiService.delete(id);
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	@ResponseStatus(value=HttpStatus.OK)
	public void update(@RequestBody ProdukAsuransi produkAsuransi){
		produkAsuransiService.update(produkAsuransi);
	}
	
	@RequestMapping(value="/getall")
	@ResponseStatus(value=HttpStatus.OK)
	public List<ProdukAsuransi> getAllProdukAsuransi(){
		return produkAsuransiService.getAllProdkAsuransi();
		
	}
	
	@RequestMapping(value="/getById/{id}",method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public ProdukAsuransi getProdukAsuransiById(@PathVariable int id){
		return produkAsuransiService.getProdukAsuransiById(id);
	}
	
	

}
