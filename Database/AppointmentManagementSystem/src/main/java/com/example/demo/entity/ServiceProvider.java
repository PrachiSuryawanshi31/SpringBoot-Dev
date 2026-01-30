package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name =" ServiceProvider-22-Jan")
public class ServiceProvider {
	
	@Id
	private int providerId;
	
	private String providerName;
	private String specialization;
	private String email;
	private long mobileNo;
	
	
	public void setProviderId(int ProviderId)   //setter
	{
		this.providerId = ProviderId;
	}
	
	public int getProviderId()			//getter
	{
		return providerId;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	


}
