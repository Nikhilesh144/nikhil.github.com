package com.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class specialistDAO {
private Connection con;

public specialistDAO(Connection con) {
	super();
	this.con = con;
}
public boolean addSpecialist(String spec) {
	boolean f= false;
	try {
		String sql="insert into specialist (specialistName) values (?)";
		PreparedStatement stmt=con.prepareStatement(sql);
		stmt.setString(1, spec);
		int i=stmt.executeUpdate();
		if(i==1) {
			f=true;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	
	return f;
	
}
   public List<specialist> getSpecialist(){
	   List<specialist> list=new ArrayList<specialist>();
	   specialist s=null;
	   try {
		   String sql="select * from specialist";
		   PreparedStatement stmt=con.prepareStatement(sql);
		   ResultSet rs= stmt.executeQuery(sql);
		   while(rs.next()) {
			   
			   s=new specialist();
			   s.setId(rs.getInt(1));
			   s.setSpecialistName(rs.getString(2));
			   list.add(s);
			   
		   }
		   
		   
		   
		   
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   
	   
	   
	return list;
	   
   }
}

