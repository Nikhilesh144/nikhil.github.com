package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Db.DbConnect;
import com.entity.specialistDAO;
import com.entity.user;
@WebServlet("/addSpecailst")

public class addSpecialist extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String specName  =req.getParameter("specName");
		specialistDAO DAO=new specialistDAO(DbConnect.getcon());
		boolean f=DAO.addSpecialist(specName);
		HttpSession session=req.getSession();
		if(f) { 
			session.setAttribute("success", "specialist added successfully");
			resp.sendRedirect("admin/adminDashboard.jsp");	
		}
		else {
			session.setAttribute("error", "something is fishy");
			resp.sendRedirect("ADMIN.jsp");
			
		}
	}
	

}
