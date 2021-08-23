package com.hibernate.dao;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.Address;
import com.hibernate.pojo.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public void insertCustomer(Customer add) throws SQLException {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		session.save(add);
		txn.commit();
		session.close();
		factory.close();

	}

	public void deleteCustomer(int id) {

		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		Customer cust = session.get(Customer.class, id);
		session.delete(cust);
		txn.commit();
		session.close();
		factory.close();

		
		
	}

}
