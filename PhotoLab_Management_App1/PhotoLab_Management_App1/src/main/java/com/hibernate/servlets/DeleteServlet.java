package com.hibernate.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hibernate.dao.CustomerDao;
import com.hibernate.dao.CustomerDaoImpl;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession http = request.getSession();
		CustomerDao cust = new CustomerDaoImpl();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		
		cust.deleteCustomer(id);
		
		
		RequestDispatcher rd = request
				.getRequestDispatcher("ShowCustomerServlet");
		rd.forward(request, response);
		
		
	}

}
