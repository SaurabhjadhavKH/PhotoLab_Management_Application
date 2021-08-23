package com.hibernate.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.Customer;



/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String id = request.getParameter("id");
		Integer userId = Integer.parseInt(id);
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Customer user = s.load(Customer.class, userId);
		request.setAttribute("user", user);
		RequestDispatcher rd = request.getRequestDispatcher("updatelist.jsp");
		rd.forward(request, response);
		
		
		
		
	}

}
