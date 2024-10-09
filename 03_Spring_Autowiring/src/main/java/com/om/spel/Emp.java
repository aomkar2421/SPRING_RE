package com.om.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Emp {
	
	@Override
	public String toString() {
		return "Emp [sum=" + sum + ", sub=" + sub + ", multi=" + multi + ", div=" + div + ", mod=" + mod + "]";
	}

	@Value("#{10+2}")
	int sum;
	
	@Value("#{10-2}")
	int sub;
	
	@Value("#{10*2}")
	int multi;
	
	@Value("#{10/2}")
	int div;
	
	@Value("#{10%2}")
	int mod;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	int num;

	public static String res() {
		return "method called";
	}
	
//	public static String res() {
//		return "method called";
//	}
	
	@Value("#{T(com.om.spel.Emp).res()}")
	String method;
}
