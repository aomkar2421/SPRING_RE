package com.om.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
//	@Autowired
//	@Qualifier("add2")
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
		System.out.println("ST SETTER");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
}
