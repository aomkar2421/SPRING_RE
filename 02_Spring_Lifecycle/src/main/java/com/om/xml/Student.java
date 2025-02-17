package com.om.xml;

public class Student {
	private String name;
	private int roll;
	
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll +  "]";
	}
	
	public void init() {
		System.out.println("Initialization");
	}
	
	public void destroy() {
		System.out.println("Destruction");
	}
}
