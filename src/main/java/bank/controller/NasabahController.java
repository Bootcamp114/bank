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
import bank.model.Employee;
import bank.model.Nasabah;
import bank.model.ProdukNasabah;
import bank.model.Rekening;
import bank.service.EmployeeService;
import bank.service.KeluargaNasabahService;
import bank.service.NasabahService;
import bank.service.ProdukNasabahService;
import bank.service.RekeningService;

@Controller
@RequestMapping("/nasabah")
public class NasabahController {

	@Autowired
	NasabahService nasabahService;
	@Autowired
	ProdukNasabahService produkNasabahService;
	@Autowired
	RekeningService rekeningService;
	@Autowired
	EmployeeService employeeService;
	@Autowired
	KeluargaNasabahService keluargaNasabahService;

	/* Nasabah */
	@ResponseBody
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public Nasabah save(@RequestBody Nasabah nasabah) {
		nasabahService.save(nasabah);
		return nasabah;
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

	@ResponseBody
	@RequestMapping(value = "/produknasabah/getprodukbyid/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public ProdukNasabah getprodukbyid(@PathVariable int id) {
		return produkNasabahService.getProdukNasabahById(id);
	}

	@RequestMapping(value = "/produknasabah/update", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void updateproduk(@RequestBody ProdukNasabah produkNasabah){
		produkNasabahService.update(produkNasabah);
	}

	/* Rekening Bank */
	@RequestMapping(value = "/rekening/save", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void saverekening(@RequestBody Rekening rekening) {
		rekeningService.save(rekening);
	}

	@RequestMapping(value = "/rekening/delete/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void deleterekening(@PathVariable int id) {
		rekeningService.delete(id);
	}

	@ResponseBody
	@RequestMapping(value = "/rekening/getrekeningbyid/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public Rekening getrekeningbyid(@PathVariable int id) {
		return rekeningService.getRekeningById(id);
	}

	@RequestMapping(value = "/rekening/update", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void updaterekening(@RequestBody Rekening rekening){
		rekeningService.update(rekening);
	}

	/* Karyawan */
	@RequestMapping(value = "/karyawan/save", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public void savekaryawan(@RequestBody Employee employee) {
		employeeService.save(employee);
	}

	@RequestMapping(value = "/karyawan/delete/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void deletekaryawan(@PathVariable int id) {
		employeeService.delete(id);
	}

	@ResponseBody
	@RequestMapping(value = "/karyawan/getkaryawanbyid/{id}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public Employee getkaryawanbyid(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}

	@RequestMapping(value = "/karyawan/update", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void updatekaryawan(@RequestBody Employee employee){
		employeeService.update(employee);
	}
}