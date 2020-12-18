package service;

import java.util.List;
import java.util.ListIterator;

import bean.Employee;
import dao.EmployeeDao;

public class EmployeeService {		// pure business logic. 

	public String storeEmployee(Employee emp) {
		EmployeeDao ed = new EmployeeDao();
		if(emp.getSalary()>12000) {
						if(ed.storeEmployee(emp)>0) {
							return "Record stored successfully";
						}else {
							return "Record didn't store";
						}
		}else {
			return "Salary must be > 12000";
		}
	}
	
	public List<Employee> getAllEmployee() {
		EmployeeDao ed = new EmployeeDao();
		List<Employee> listOfEmployee = ed.retrieveAllEmployee();
		ListIterator<Employee> li = listOfEmployee.listIterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			emp.setSalary(emp.getSalary()+emp.getSalary()*0.10f);
		}
		return listOfEmployee;
	}
}
