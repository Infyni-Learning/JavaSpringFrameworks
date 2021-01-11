package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public String storeEmpoyee(Employee emp) {
		
		if(emp.getSalary()<12000) {
			return "Salary must be >12000";
		}else {
			if(employeeDao.storeEmployee(emp)>0) {
					return "Record stored";
			}else {
				return "Record didn't store";
			}
		}
	}
}
