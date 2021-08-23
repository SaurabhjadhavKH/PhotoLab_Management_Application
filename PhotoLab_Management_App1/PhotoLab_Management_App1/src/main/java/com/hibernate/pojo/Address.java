package com.hibernate.pojo;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String City;
	private String State;
	private int PINCODE;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String state, int pINCODE) {
		super();
		City = city;
		State = state;
		PINCODE = pINCODE;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPINCODE() {
		return PINCODE;
	}

	public void setPINCODE(int pINCODE) {
		PINCODE = pINCODE;
	}

	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + ", PINCODE=" + PINCODE + "]";
	}
	
	

}
