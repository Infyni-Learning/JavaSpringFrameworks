package com;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = "empDb",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeeDetails() {
		return employeeService.getEmployeeDetails();
	}
	
	@PutMapping(value = "empUpdate")
	public String updateSalary(@RequestBody Employee emp) {
		return employeeService.updateEmployeeDetails(emp);
	}
}
