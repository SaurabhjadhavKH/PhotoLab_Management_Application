package com.hibernate.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.pojo.Customer;



public class ShowCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ShowCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession hs = request.getSession();
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		Query query = session.createQuery("FROM Customer");
		List<Customer> slist = query.getResultList();
		
		hs.setAttribute("list", slist);
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("DisplayCustomer.jsp");
		rd.forward(request, response);
		
	}

	
	
}
