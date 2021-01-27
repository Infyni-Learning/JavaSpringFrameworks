package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> getEmployeeDetails() {
		return employeeDao.getAllEmployee();
	}
	
	public String updateEmployeeDetails(Employee emp) {
		if(emp.getSalary()<0) {
		return "Salary must be +ve";
		}else {
		return employeeDao.updateEmployee(emp);
		}
	}
}
