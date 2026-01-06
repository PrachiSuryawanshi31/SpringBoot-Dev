package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "student-12-DEC")
public class Student {
	
	//Basic Details
	
	@Id
	private int id;
	private String firstName ;
	private String lastName;
	private LocalDate dateOfBirth;
	private String gender;
	private int age;
	
	//Acadmical Details
	
	private int standard;
	private String div;
	private Integer rollNo;
	private Integer addmissionNo;
	private LocalDate addmissionDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getStandard() {
		return standard;
	}
	
	public void setStandard(int standard) {
		this.standard = standard;
	}
	
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public Integer getAddmissionNo() {
		return addmissionNo;
	}
	public void setAddmissionNo(Integer addmissionNo) {
		this.addmissionNo = addmissionNo;
	}
	public LocalDate getAddmissionDate() {
		return addmissionDate;
	}
	public void setAddmissionDate(LocalDate addmissionDate) {
		this.addmissionDate = addmissionDate;
	}
	
}
