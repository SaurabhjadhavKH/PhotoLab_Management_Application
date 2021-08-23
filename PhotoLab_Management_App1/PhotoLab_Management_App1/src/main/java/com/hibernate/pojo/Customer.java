package com.hibernate.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Customer_ID;
	private String Customer_Name;
	private Address address;
	private String Gender;
	private long Mobile_Number;
	private int Total_Amount;
	private String Paid_Status;
	private int No_Of_Copies;
	private String Type_Of_Photos;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customer_ID, String customer_Name, Address address, String gender, long mobile_Number,
			int total_Amount, String paid_Status, int no_Of_Copies, String type_Of_Photos) {
		super();
		Customer_ID = customer_ID;
		Customer_Name = customer_Name;
		this.address = address;
		Gender = gender;
		Mobile_Number = mobile_Number;
		Total_Amount = total_Amount;
		Paid_Status = paid_Status;
		No_Of_Copies = no_Of_Copies;
		Type_Of_Photos = type_Of_Photos;
	}
	
	
	

	public Customer(String customer_Name, Address address, String gender, long mobile_Number, int total_Amount,
			String paid_Status, int no_Of_Copies, String type_Of_Photos) {
		super();
		Customer_Name = customer_Name;
		this.address = address;
		Gender = gender;
		Mobile_Number = mobile_Number;
		Total_Amount = total_Amount;
		Paid_Status = paid_Status;
		No_Of_Copies = no_Of_Copies;
		Type_Of_Photos = type_Of_Photos;
	}
	
	
	
	

	public int getCustomer_ID() {
		return Customer_ID;
	}

	public void setCustomer_ID(int customer_ID) {
		Customer_ID = customer_ID;
	}

	public String getCustomer_Name() {
		return Customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public long getMobile_Number() {
		return Mobile_Number;
	}

	public void setMobile_Number(long mobile_Number) {
		Mobile_Number = mobile_Number;
	}

	public int getTotal_Amount() {
		return Total_Amount;
	}

	public void setTotal_Amount(int total_Amount) {
		Total_Amount = total_Amount;
	}

	public String getPaid_Status() {
		return Paid_Status;
	}

	public void setPaid_Status(String paid_Status) {
		Paid_Status = paid_Status;
	}

	public int getNo_Of_Copies() {
		return No_Of_Copies;
	}

	public void setNo_Of_Copies(int no_Of_Copies) {
		No_Of_Copies = no_Of_Copies;
	}

	public String getType_Of_Photos() {
		return Type_Of_Photos;
	}

	public void setType_Of_Photos(String type_Of_Photos) {
		Type_Of_Photos = type_Of_Photos;
	}

	@Override
	public String toString() {
		return "Customer [Customer_ID=" + Customer_ID + ", Customer_Name=" + Customer_Name + ", address=" + address
				+ ", Gender=" + Gender + ", Mobile_Number=" + Mobile_Number + ", Total_Amount=" + Total_Amount
				+ ", Paid_Status=" + Paid_Status + ", No_Of_Copies=" + No_Of_Copies + ", Type_Of_Photos="
				+ Type_Of_Photos + "]";
	}
	
	
	
	
	
	
	
	
	

}
