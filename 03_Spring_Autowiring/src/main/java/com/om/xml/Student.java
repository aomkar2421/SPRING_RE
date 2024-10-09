package com.om.xml;

public class Student {
	private String name;
	private Address address;	
	
	public Student() {
		
	}
		
	public Student(String name, Address address) {
		super();
		System.out.println("Student constructor");
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Student setter");
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
}
