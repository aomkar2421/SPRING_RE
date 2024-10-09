package com.om.javaconfig;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Emp {
	
//	@Value("OMKAR")
	String name;
//	@Value("1652")
	int id;
	Address address;
	
	
	public Emp(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

}
