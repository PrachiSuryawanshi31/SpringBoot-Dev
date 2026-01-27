package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BloodStock-26-Jan")
public class BloodStock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bloodStockId;
	
	private String bloodGroup;
	private  int quantity;
	private LocalDate expiryDate;
	private String storageLoction;
	
	public int getStockId() {
		return bloodStockId;
	}
	public void setStockId(int bloodStockId) {
		this.bloodStockId = bloodStockId;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getStorageLoction() {
		return storageLoction;
	}
	public void setStorageLoction(String storageLoction) {
		this.storageLoction = storageLoction;
	}
	
}
