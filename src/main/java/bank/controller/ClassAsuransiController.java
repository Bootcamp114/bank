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

import bank.model.ClassAsuransi;
import bank.service.ClassAsuransiService;

@Controller
@RequestMapping("/classasuransi")
public class ClassAsuransiController {

	@Autowired
	ClassAsuransiService classAsuransiService;
	
	@RequestMapping
	public String index(){
		return "ClassAsuransi";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public void save(@RequestBody ClassAsuransi classAsuransi){
		classAsuransiService.save(classAsuransi);
		
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(value=HttpStatus.OK)
	public void delete(@PathVariable int id){
		classAsuransiService.delete(id);
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	@ResponseStatus(value=HttpStatus.OK)
	public void update(@RequestBody ClassAsuransi classAsuransi){
		classAsuransiService.update(classAsuransi);
	}
	
	@ResponseBody
	@RequestMapping(value="/getall")
	@ResponseStatus(value=HttpStatus.OK)
	public List<ClassAsuransi> getAllClassAsuransi(){
		return classAsuransiService.getAllClassAsuransi();
		
	}
	@RequestMapping(value="/getbyid/{id}",method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public ClassAsuransi getClassAsuransiById(@PathVariable int id){
		return classAsuransiService.getClassAsuransiById(id);
		
	}
}
