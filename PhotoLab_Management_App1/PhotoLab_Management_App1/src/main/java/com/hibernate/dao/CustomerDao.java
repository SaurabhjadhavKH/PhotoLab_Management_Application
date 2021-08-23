package com.hibernate.dao;

import java.sql.SQLException;

import com.hibernate.pojo.Address;
import com.hibernate.pojo.Customer;

public interface CustomerDao {
	
	public void  insertCustomer(Customer add) throws SQLException;
	public void deleteCustomer(int id);
		
	

}
