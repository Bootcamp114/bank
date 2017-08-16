package bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import bank.model.Polis;
import bank.service.PolisService;

@Controller
@RequestMapping("/poliscontroller")
public class PolisController {
	
	@Autowired
	PolisService polisService;

	@RequestMapping(value="/save",method= RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public void save(@RequestBody Polis polis){
		polisService.save(polis);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(value=HttpStatus.OK)
	public void delete(@PathVariable int id){
		polisService.delete(id);
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	@ResponseStatus(value=HttpStatus.OK)
	public void update(@RequestBody Polis polis){
		polisService.update(polis);
	}
	
	@ResponseBody
	@RequestMapping(value="/getall")
	@ResponseStatus(value=HttpStatus.OK)
	public List<Polis> getAllPolis(@RequestBody Polis polis){
		return polisService.getAllPolis();
	}
	
	@ResponseBody
	@RequestMapping(value="/getbyid",method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public Polis getPolisById(@PathVariable int id){
		return polisService.getPolisById(id);
	}
}
