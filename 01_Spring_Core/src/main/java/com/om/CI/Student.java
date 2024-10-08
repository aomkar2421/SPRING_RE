package com.om.CI;

import java.util.List;

public class Student {
	private String name;
	private int roll;
	private Address address;
	private List<String> phone;
	
	public Student(String name, int roll, Address address, List<String> phone) {
		super();
		this.name = name;
		this.roll = roll;
		this.address = address;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", address=" + address + ", phone=" + phone + "]";
	}
	
}
