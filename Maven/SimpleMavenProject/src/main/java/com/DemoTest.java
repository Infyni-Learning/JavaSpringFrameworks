package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ApplicationContext ac = new ClassPathXmlApplicationContext();
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
		Employee emp = (Employee)ac.getBean("employee");
		emp.display();
	}

}
