package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Certification;
import com.example.demo.repository.CertificationRepository;
import com.example.demo.service.CertificationService;

@Service
public class CertificationServiceImpl implements CertificationService{
	
	@Autowired
	CertificationRepository certificationRepository;

	@Override
	public void addCertification(Certification certification) {
		// TODO Auto-generated method stub
		certificationRepository.save(certification);
		
	}

	@Override
	public Certification updateCertification(Certification certification) {
		// TODO Auto-generated method stub
		return certificationRepository.save(certification);
	}

	@Override
	public List<Certification> getAllCertifications(Certification certification) {
		// TODO Auto-generated method stub
		return certificationRepository.findAll();
	}

	@Override
	public Certification getCertification(int certificationId) {
		// TODO Auto-generated method stub
		return certificationRepository.findById(certificationId).get();
	}

	@Override
	public void deleteAllCertifications(Certification certification) {
		// TODO Auto-generated method stub
		certificationRepository.deleteAll();
		
	}

	@Override
	public void deleteCertification(int certificationId) {
		// TODO Auto-generated method stub
		certificationRepository.deleteById(certificationId);
		
	}
	
	

}
