package com.om.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
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

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization");
	}
	
}
