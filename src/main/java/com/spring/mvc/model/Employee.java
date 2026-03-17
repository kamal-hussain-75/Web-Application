package com.spring.mvc.model;



public class Employee {
	
	private String username,department,address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String username, String department, String address) {
		super();
		this.username = username;
		this.department = department;
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [username=" + username + ", department=" + department + ", address=" + address + "]";
	}
	

}
