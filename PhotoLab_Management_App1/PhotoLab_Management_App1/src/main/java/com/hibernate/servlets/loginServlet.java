package com.hibernate.servlets;

import java.io.IOException;

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

import com.hibernate.pojo.LoginPojo;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		/*
		 * LoginPojo std = new LoginPojo("sagar@gmail.com","12345"); session.save(std);
		 */	

		LoginPojo student = session.load(LoginPojo.class, 1);

		if (student.getUsername().equals(username) && student.getPassword().equals(password)) {
			
			HttpSession http = request.getSession();
			http.setAttribute("username", username);
			
			RequestDispatcher rd = request.getRequestDispatcher("customer.jsp");
			
			rd.forward(request, response);
			
			
		} else {

			RequestDispatcher rd = request
					.getRequestDispatcher("login.jsp?message=Either username or password is wrong");
			rd.forward(request, response);

		}

		txn.commit();
		session.close();
		factory.close();

	}

}
