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

import bank.model.JumlahStoran;
import bank.service.JumlahStoranService;

@Controller
@RequestMapping(value="jumlahstoran")
public class JumlahStoranController {
	
	@Autowired
	JumlahStoranService jumlahStoranService;
	
	public String index(){
		return "JumlahStoran";
	}
	
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public void save(@RequestBody JumlahStoran jumlahStoran){
		jumlahStoranService.save(jumlahStoran);
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	@ResponseStatus(value=HttpStatus.OK)
	public void delete(@PathVariable int id){
		jumlahStoranService.delete(id);
	}
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	@ResponseStatus(value=HttpStatus.OK)
	public void update(@RequestBody JumlahStoran jumlahStoran){
		jumlahStoranService.update(jumlahStoran);
	}
	@RequestMapping(value="/getall")
	@ResponseStatus(value=HttpStatus.OK)
	public List<JumlahStoran> getAllJumlahStoran(){
		return jumlahStoranService.getAllJumlahStoran();
	}
	@RequestMapping(value="/getbyid",method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public JumlahStoran getJumlahStoranById(@PathVariable int id){
		return jumlahStoranService.getJumlahStoranById(id);
	}

}
