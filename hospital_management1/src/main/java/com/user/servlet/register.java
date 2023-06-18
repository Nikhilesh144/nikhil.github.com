package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.Db.DbConnect;
import com.dao.userDAO;
import com.entity.user;
@WebServlet("/register")

public class register extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 try {
		 String name=req.getParameter("NAME");
		 String password=req.getParameter("password");
		 String email=req.getParameter("email");
		 String phone=req.getParameter("phoneNO");
		 String Dob=req.getParameter("DOB");
		 String re_password=req.getParameter("re-password");
		 String Address=req.getParameter("address");
		 
	
		 
		boolean userstatus = false;
		user u=new user( name,  password,  email,  phone, Dob,  re_password,  Address,userstatus);
		 userDAO dao=new userDAO(DbConnect.getcon());
		 HttpSession session=req.getSession();
		 
		 boolean f=dao.Register(u);
		 if(f) {
			 
			 session.setAttribute("success", "registration sucessful");
			 resp.sendRedirect("SIGNUP.jsp");
			 
		 }
		 else {
			 
			 session.setAttribute("error", "Not Registered");
			 resp.sendRedirect("SIGNUP.jsp");
		 }
		 
		 
		 
	 }
	 catch(Exception e) {
		 e.printStackTrace();
		 
	 }
	}
	

}
