package com.entity;

public class user {
	private int id;
	private String name;
	private String pass;
	private String email;
	private String phone;
	private String dob;
    private String re_pass;
    private String Address;
    private boolean userstatus;
    
    


	public user() {
		super();
		// TODO Auto-generated constructor stub
	}

	public user(String name, String pass, String email, String phone, String dob, String re_pass, String address,boolean userstatus) {
		super();
		this.name = name;
		this.pass = pass;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
		this.re_pass = re_pass;
		this.Address = address;
		this.userstatus= userstatus;
	
	}
	


	public boolean getUserstatus() {
		return userstatus;
	}

	public boolean setUserstatus(boolean userstatus) {
		return this.userstatus = userstatus;
	}

	public int getId() {
		return id;
	}

	public int setId(int id) {
		return this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getRe_pass() {
		return re_pass;
	}
	public void setRe_pass(String re_pass) {
		this.re_pass = re_pass;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}


	


}
