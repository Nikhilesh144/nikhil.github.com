package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.doctor;
import com.mysql.cj.protocol.Resultset;

public class doctorDAO {
	private Connection con;

	public doctorDAO(Connection con) {
		super();
		this.con = con;
	}
	public boolean RegisterDoctor(doctor d)
	{
		boolean f= false;
		try {
			String sql="insert into doctor_details( Doctor_Name, Doctor_Age, Doctor_Gender, Doctor _Qualification, Doctor _Specalization, Doctor_Email, Doctor_Phone_Number, Doctor_Address, Doctor_Aadhar_Number, Doctor_Password, DOB)values(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1, d.getFullName());
			stmt.setInt(2, d.getAge());
			stmt.setString(3,d.getGENDER());
			stmt.setString(4,d.getQualification());
			stmt.setString(5,d.getSpecialization());
			stmt.setString(6, d.getEmail());
			stmt.setString(7, d.getPhoneNumber());
			stmt.setString(8, d.getAddress());
			stmt.setInt(9, d.getAadharNumber());
			stmt.setString(10, d.getPassword());
			stmt.setString(11, d.getDob());
			int i= stmt.executeUpdate();
			if(i==1)
			{
			f=true;	
			}
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
		}
		
		
		
		return f;
	}

}
