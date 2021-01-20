package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping(value = "empXml",produces = MediaType.APPLICATION_XML_VALUE)
	public Employee getEmployeeInfo() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(14000);
		return emp;
		/*
		 * 	<emp><id>100</id><name>Ravi</name><salary14000</salary></emp>
		 * 
		 */
	}
	
	@RequestMapping(value = "empJson",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeInfoJso() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(14000);	
		/*
		 * 	{"id":100,"name":"Ravi","salary":14000}
		 */
		return emp;
	}
	
	@RequestMapping(value = "allEmployee",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeeDetails() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(1, "Ravi", 14000));
		listOfEmp.add(new Employee(2, "Ramesh", 16000));
		listOfEmp.add(new Employee(3, "Rajesh", 18000));
		listOfEmp.add(new Employee(4, "Lokesh", 20000));
		return listOfEmp;
	}
	
}
