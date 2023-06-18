package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.Db.DbConnect;
import com.entity.specialist;
import com.entity.user;
import com.mysql.cj.protocol.Resultset;

public class userDAO {
	private Connection con;

	public userDAO(Connection con) {
		super();
		this.con = con;
	}
	public boolean Register(user u) {
		boolean f=false;
		try {
			String sql="insert into users(username, password, email, phonenumber, DOB, Re_password, Address)values(?,?,?,?,?,?,?)";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1, u.getName());
			stmt.setString(2, u.getPass());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPhone());
			stmt.setString(5, u.getDob());
			stmt.setString(6, u.getRe_pass());
			stmt.setString(7, u.getAddress());
			 int i=stmt.executeUpdate();
			 if(i==1) {
				 f= true;
				 
				 
			 }
			
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
		}
		
		
		
		return f;
		
		
		
	}
	public user login(String email,String pass) {
		user u=null;

		try {
		String sql="select * from users where  email=? and password=?" ;
		PreparedStatement stmt= con.prepareStatement(sql);
		stmt.setString(1, email);
		stmt.setString(2, pass);
		ResultSet rs=stmt.executeQuery();
		while( rs.next()) {
			u =new user();
			u.setId( rs.getInt(1));
			u.setName( rs.getString(2));
			u.setEmail( rs.getString(4));
			u.setPass( rs.getString(3));
			
		
			
		}
		
		
		
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return u;
	}
//	public String status(String email) {
//		
//	
//		String T=null;
//		user s=null;
//		
//
//		try {
//			String sql="select status from users where  email=?" ;
//		PreparedStatement stmt= con.prepareStatement(sql);
//		stmt.setString(1,email);
//	
//		ResultSet rs=stmt.executeQuery(sql);
//		while(rs.next()) {	
//			s=new user();
//		 s.setUserstatus(rs.getString("status"));
//		 T=s.getUserstatus();
//		}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			
//		}		
//		return T;
//	}
    
//      public List<String> getUsers(){
//   	   List<String> list=new ArrayList<String>();
//   	List<String> list1=new ArrayList<String>();
//   	   user s=null;
//   	   try {
//   		   String sql="select * from users";
//   		   PreparedStatement stmt=con.prepareStatement(sql);
//   		   int i;
//   		   ResultSet rs= stmt.executeQuery(sql);
//   		   while(rs.next()) {
//   			   
//   			   s=new user();
//   			 s.setUserstatus(rs.getString(9));
//   			
//   			 String t =s.getUserstatus();
//   			i = s.setId(rs.getInt(1));
//   			list1.add(0,list.get(i-1));
//   	   		System.out.println(list1.get(s.getId()));
//   			   
//   			   list.add(t);
//   		
//   			  
//   			   
//   			   
//   			   
//   		   }
//   		
//   	   }
//   		  catch(Exception e) {
//   		   e.printStackTrace();
//   	   }
//   	   
//   	   
//   	   
//   	   
//   	return list;
//   	   
//      
//   		   }
  	public boolean loginstat(String email,String pass) {
		user u=null;
		 boolean R=false;

		try {
		String sql="select status from users where  email=? " ;
		PreparedStatement stmt= con.prepareStatement(sql);
		stmt.setString(1, email);
		
		ResultSet rs=stmt.executeQuery();
		while( rs.next()) {
			u =new user();
		    u.setUserstatus(rs.getBoolean(1));
		    R=u.getUserstatus();	
		}
		   System.out.println(R);
		  
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

		return R;
	}
      public static void main(String[]args) {
    		userDAO D=new userDAO(DbConnect.getcon());
//    		System.out.println(D.status("kamal@gmail.com"));
//    		System.out.println(D.getUsers());
    		
    		
        }
   		   
   		   
   		   
   		   
   	   }













