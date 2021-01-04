package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee)ac.getBean("employee");
		//emp.display();
		//emp.setId(100);
		//emp.setName("Ravi");
		//emp.setSalary(15000);
		System.out.println(emp);
	}

}
