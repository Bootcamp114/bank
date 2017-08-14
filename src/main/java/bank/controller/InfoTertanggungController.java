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

import bank.model.InfoTertanggung;
import bank.service.InfoTertanggungService;

@Controller
@RequestMapping("/infotertanggungcontroller")
public class InfoTertanggungController {
	
	@Autowired
	InfoTertanggungService infoTertanggungService;

	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public void save(@RequestBody InfoTertanggung infoTertanggung){
		infoTertanggungService.save(infoTertanggung);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(value=HttpStatus.OK)
	public void delete(@PathVariable int id){
		infoTertanggungService.delete(id);
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	@ResponseStatus(value=HttpStatus.OK)
	public void update(@RequestBody InfoTertanggung infoTertanggung){
		infoTertanggungService.update(infoTertanggung);
	}
	
	@RequestMapping(value="/getall")
	@ResponseStatus(value=HttpStatus.OK)
	public List<InfoTertanggung> getAllInfoTertanggung(){
		return infoTertanggungService.getAllInfoTertanggung();
	}
	
	@RequestMapping(value="/getbyid/{id}",method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public InfoTertanggung getInfoTertanggungById(@PathVariable int id){
		return infoTertanggungService.getInfoTertanggungById(id);
	}
}
