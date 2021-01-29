package com;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.OptBoolean;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> getEmployeeDetails() {
		return employeeDao.findAll();
	}
	
	public String getEmloyee(int id) {
	Optional<Employee> op = employeeDao.findById(id);
	if(op.isPresent()) {
		return "yes REcord is present";
	}else {
		return "no record not present";
	}
	
	}
	public String updateEmployeeDetails(Employee emp) {
		if(emp.getSalary()<0) {
		return "Salary must be +ve";
		}else {
		Optional<Employee> op= employeeDao.findById(emp.getId());
				if(op.isPresent()) {
					Employee e=  op.get();
					e.setSalary(emp.getSalary());
					employeeDao.saveAndFlush(e);
					return "Record updated successfully";
				}else {
					return "Record is not present";
				}
		}
	}
}
