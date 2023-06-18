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
@ WebServlet("/userLogin")

public class userLogin extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			HttpSession session=req.getSession();
			userDAO dao=new userDAO(DbConnect.getcon());
		//	String val=dao.status(email);
			boolean F=dao.loginstat(email, password);
			
			user A=new user();
			if(F) {
				user user=dao.login(email, password);
				if(user!=null) { 
					session.setAttribute("userObj",  user);
					resp.sendRedirect("INDEX.jsp");	
				}
				else {
					session.setAttribute("error", "Invalid E-mail or Password");
					resp.sendRedirect("USER.jsp");
					
				}
				
			}
		
		
			else {
				session.setAttribute("error", "Contact Admin for Approval");
				resp.sendRedirect("USER.jsp");
				
			}
			
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	

}
