package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Certification;

public interface CertificationService {
	
	void addCertification(Certification certification);
	
	Certification updateCertification(Certification certification);
	
	List<Certification> getAllCertifications(Certification certification);
	
	Certification getCertification(int certificationId);
	
	void deleteAllCertifications(Certification certification);
	
	void deleteCertification(int certificationId);
}
