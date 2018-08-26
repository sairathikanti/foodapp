package com.food.beans;

public class FoodDisplayBean {
	private String name,email,mobileno,address;

	
	public FoodDisplayBean(String name, String email, String mobileno, String address) {
		super();
		this.name = name;
		this.email = email;
		this.mobileno = mobileno;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}