package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		//Employee emp = new Employee();
		//emp.display();
		
		Resource res = new ClassPathResource("beans.xml");	//load the XML file 			// Run time polymorphsim 
		BeanFactory factory = new XmlBeanFactory(res);		// created the reference of BeanFActory 
		/*Employee emp1 = (Employee)factory.getBean("emp1");	// Pull the object from container 
		emp1.display();
		
		Employee emp4 = (Employee)factory.getBean("emp1");	// Pull the object from container 
		emp4.display();
		
		Employee emp2 = (Employee)factory.getBean("emp2");	// Pull the object from container 
		emp2.display();
		
		Employee emp3 = (Employee)factory.getBean("emp2");	// Pull the object from container 
		emp3.display();
		*/
		/*
		Employee emp1 = (Employee)factory.getBean("emp1");
		System.out.println(emp1);
		
		Employee emp2 = (Employee)factory.getBean("emp2");
		System.out.println(emp2);
		
		
		Employee emp3 = (Employee)factory.getBean("emp3");
		System.out.println(emp3);
		
		
		Employee emp4 = (Employee)factory.getBean("emp4");
		System.out.println(emp4);
		
		Employee emp5 = (Employee)factory.getBean("emp5");
		System.out.println(emp5);
		
		Address add = (Address)factory.getBean("address");
		System.out.println(add);
		*/
		
		
		Employee employee = (Employee)factory.getBean("employee");
		// add = employee.getAdd();

		System.out.println(employee);
		//System.out.println(add.getCity());
	}

}
