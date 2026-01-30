package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.MessageConstant;
import com.example.demo.entity.Certification;
import com.example.demo.service.CertificationService;


@RestController
@RequestMapping("certification")
public class CertificationController {
	
	@Autowired
	CertificationService certificationService;
	
	public String addCertification(@RequestBody Certification certification)
	{
		certificationService.addCertification(certification);
		return MessageConstant.CERTIFICATION_ADDED;
	}
	

	@PutMapping("update")
	public Certification updateStudent(@RequestBody Certification certification)
	{
		return certificationService.updateCertification(certification);
	}
	
	@GetMapping("getAll")
	public List<Certification> getAllCertifications(@RequestBody Certification certification)
	{
		return certificationService.getAllCertifications(certification);
	}
	
	@GetMapping("get/{certificationId}")
	public Certification getCertification(@PathVariable int certificationID)
	{
		return certificationService.getCertification(certificationID);
	}
	
	
	@DeleteMapping("deleteAll")
	public String deleteAllStudent(@RequestBody Certification certification)
	{
		certificationService.deleteAllCertifications(certification);
		return MessageConstant.ALL_CERTIFICATION_DELETED;
	}
	
	@DeleteMapping("delete/{certificationId}")
	public String deleteCertification(@PathVariable int certificationId)
	{
		certificationService.deleteCertification(certificationId);
		return MessageConstant.CERTIFICATION_DELETED;
	}


}
