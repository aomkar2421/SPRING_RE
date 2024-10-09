package com.om.javaconfig;

public class Address {
	
	String name;
	
	Address(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + "]";
	}
	
}
