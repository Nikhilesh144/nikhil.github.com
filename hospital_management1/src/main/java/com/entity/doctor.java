package com.entity;

public class doctor {
	private String phoneNumber;
	private int Age;
	private String GENDER;
	private String Address;
	private int AadharNumber;
	private String Password;
	public doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String fullName;
	private String dob;
	private String qualification;
	private String specialization;
	private String Email;
	public doctor(String fullName, String dob, String qualification, String specialization, String email,
			String phoneNumber, int age, String GENDER, String address, int aadharNumber, String password) {
		super();
		this.fullName = fullName;
		this.dob = dob;
		this.qualification = qualification;
		this.specialization = specialization;
		this.Email = email;
		this.phoneNumber = phoneNumber;
		this.Age = age;
		this.GENDER = GENDER;
		Address = address;
		this.AadharNumber = aadharNumber;
		Password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAadharNumber() {
		return AadharNumber;
	}
	public void setAadharNumber(int aadharNumber) {
		AadharNumber = aadharNumber;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	
	
	

}
