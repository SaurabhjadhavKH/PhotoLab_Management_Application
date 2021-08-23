package com.hibernate.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.Address;
import com.hibernate.pojo.Customer;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String  Customer_Name= request.getParameter("userName");
		String City = request.getParameter("city");
		String State = request.getParameter("state");
		int PINCODE = Integer.parseInt(request.getParameter("pin"));
		String Gender= request.getParameter("userPass");
		long Mobile_Number= Long.parseLong(request.getParameter("mobile"));
		int Total_Amount= Integer.parseInt(request.getParameter("amount"));
		String Paid_Status= request.getParameter("status");
		int No_Of_Copies= Integer.parseInt(request.getParameter("copy"));
		String Type_Of_Photos= request.getParameter("photo"); 
		
		Address add = new Address(City,State,PINCODE);
		
		Customer obj = new Customer(Customer_Name,add,Gender,Mobile_Number,Total_Amount,Paid_Status,No_Of_Copies,Type_Of_Photos);
		
		obj.setCustomer_ID(id);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(obj);
		transaction.commit();
		session.close();
		sf.close();
		System.out.println("User updated successfully!!!");
		RequestDispatcher rd = request.getRequestDispatcher("ShowCustomerServlet");
		rd.forward(request,response);

		
		
		
		
		
		
	}

}
