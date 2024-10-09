package com.om.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/om/impl/config.xml");
        context.registerShutdownHook();
        
        Student student = (Student) context.getBean("std");
        System.out.println(student);
        
    }
}
