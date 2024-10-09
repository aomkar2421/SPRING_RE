package com.om.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Emp {
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Value("OMKAR")
	private String name;
	@Value("1651")
	private int id;
	
	@Value("#{ad}")
	private List<String> address;
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", address=" + address + "]";
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


}
