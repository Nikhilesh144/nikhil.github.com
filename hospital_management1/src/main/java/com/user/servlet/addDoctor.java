package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Db.DbConnect;
import com.dao.doctorDAO;
import com.entity.doctor;
@WebServlet("")

public class addDoctor extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String fullName=req.getParameter("full_name");
			String DOB=req.getParameter("DOB");
			String Qualification=req.getParameter("Qualification");
			String specialization=req.getParameter("specialization");
			String Email =req.getParameter("E-mail");
			String  PhoneNumber=req.getParameter("Phone_Number");
			String gender=req.getParameter("gender");
			String Address=req.getParameter("Address");
			String Aadhar_number=req.getParameter("Aadhar_number");
			String Password=req.getParameter("Password");
			doctor d=new doctor(fullName, DOB, Qualification, specialization, Email, PhoneNumber, 0, gender, Address, 0, Password);
			doctorDAO dao=new doctorDAO(DbConnect.getcon());
			HttpSession session=req.getSession();
			if(dao.RegisterDoctor(d)) {
				
				 session.setAttribute("success", "registration sucessful");
				 resp.sendRedirect("DoctorDetails.jsp");
			}
			else {
				 session.setAttribute("error", "check server");
				 resp.sendRedirect("DoctorDetails.jsp");
			}
			
			
			
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	

}
