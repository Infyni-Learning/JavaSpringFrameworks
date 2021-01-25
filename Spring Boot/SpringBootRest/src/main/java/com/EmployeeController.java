package com;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping(value = "empGet")
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ramesh");
		emp.setSalary(16000);
		return emp;
	}
	
	@GetMapping(value = "employees")
	public List<Employee> getEmployeeDetails() {
		Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("Ramesh");
		emp1.setSalary(16000);
		
		Employee emp2 = new Employee();
		emp2.setId(100);
		emp2.setName("Ramesh");
		emp2.setSalary(16000);
		
		Employee emp3 = new Employee();
		emp3.setId(100);
		emp3.setName("Ramesh");
		emp3.setSalary(16000);
		
		List<Employee> listOfEmp = new LinkedList<Employee>();
		listOfEmp.add(emp1); listOfEmp.add(emp2); listOfEmp.add(emp3);
		
		return listOfEmp;
	}
	@PostMapping(value = "storeEmployee")
	public void storeEmployeeDetails(@RequestBody Employee emp) {
		System.out.println(emp);
	}
	
	
	
	@Autowired
	EmployeeService employeeService;

	@GetMapping(value = "employeesDb")
	public List<Employee> getEmployeeDb() {
		return employeeService.getEmployeeDetails();
	}
}











