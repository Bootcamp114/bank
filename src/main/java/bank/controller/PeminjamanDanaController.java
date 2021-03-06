package bank.controller;

import java.sql.Blob;

import javax.sql.rowset.serial.SerialBlob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;

import bank.model.MyFiles;
import bank.model.PeminjamanDana;
import bank.service.MyFileService;
import bank.service.PeminjamanDanaService;

@Controller
@RequestMapping("/pinjamdana")
public class PeminjamanDanaController {
	
	@Autowired
	PeminjamanDanaService pinjamDnService;
	@Autowired
	MyFileService myFileService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public void save(@RequestBody PeminjamanDana pinjamdn) {
		pinjamDnService.save(pinjamdn);
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	@ResponseStatus(value=HttpStatus.OK)
	public void delete(@PathVariable int id) {
		pinjamDnService.delete(id);
	}

	@ResponseBody
	@RequestMapping(value="/doupload", method=RequestMethod.POST)
	public void doUpload(@RequestParam("theFiles") MultipartFile theFiles) {
		MyFiles myFiles = null;
		if(!theFiles.isEmpty()) {
			try {
				byte[] bFiles = theFiles.getBytes();
				myFiles = new MyFiles();
				Blob blob = new SerialBlob(bFiles);
				myFiles.setFile(blob);
				myFiles.setName(theFiles.getName());
				myFileService.save(myFiles);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}