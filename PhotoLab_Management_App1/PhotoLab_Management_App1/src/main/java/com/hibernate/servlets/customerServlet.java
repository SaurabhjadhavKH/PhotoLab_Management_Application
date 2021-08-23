package com.hibernate.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hibernate.dao.CustomerDao;
import com.hibernate.dao.CustomerDaoImpl;
import com.hibernate.pojo.Address;
import com.hibernate.pojo.Customer;

/**
 * Servlet implementation class customerServlet
 */
public class customerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String  Customer_Name= request.getParameter("cname");
		
		String City = request.getParameter("city");
		String State = request.getParameter("state");
		int PINCODE = Integer.parseInt(request.getParameter("pin"));
		String Gender= request.getParameter("gender");
		long Mobile_Number= Long.parseLong(request.getParameter("mobile"));
		int Total_Amount= Integer.parseInt(request.getParameter("amount"));
		String Paid_Status= request.getParameter("status");
		int No_Of_Copies= Integer.parseInt(request.getParameter("copy"));
		String Type_Of_Photos= request.getParameter("photo"); 
		
		Address add = new Address(City,State,PINCODE);
		
		Customer obj = new Customer(Customer_Name,add,Gender,Mobile_Number,Total_Amount,Paid_Status,No_Of_Copies,Type_Of_Photos);
		
		
		CustomerDao dao = new CustomerDaoImpl();
		try {
			dao.insertCustomer(obj);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request
				.getRequestDispatcher("customer.jsp?message1=Customer Details Added Successfully");
		rd.forward(request, response);
		
		
		
	}

}
