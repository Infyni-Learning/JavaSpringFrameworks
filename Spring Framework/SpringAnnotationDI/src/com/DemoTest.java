package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigurationDetails.class);
		Employee emp = (Employee)ac.getBean("employee");
		System.out.println(emp);
		
		Address add = (Address)ac.getBean("address");
		System.out.println(add);
	}

}
