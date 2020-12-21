package service;

import java.util.ArrayList;
import java.util.List;

import bean.Employee;

public class EmployeeService {
		public String addEmployee(Employee emp) {
			//Call DAO method 
			
			if(emp.getSalary()>15000) {
			return "Added successfully";
			}else {
				return "Salary must be > 15000";
			}
		}
		public int addMoreEmployee(List<Employee> listOfRec) {
		//coding 
			return listOfRec.size();
		}
		public Employee getEmployeeById(int id) {
			
			Employee emp = new Employee();
			emp.setId(100);
			emp.setName("Ravi");
			emp.setSalary(15000);
			
			if(id==emp.getId()) {
				return emp;
			}else {
				return null;
			}
			
		}
		public List<Employee> getAllEmployee() {
			List<Employee> listOfEmployees = new ArrayList<Employee>();
			listOfEmployees.add(new Employee(1, "Ramesh", 14000));
			listOfEmployees.add(new Employee(2, "Raju", 16000));
			listOfEmployees.add(new Employee(3, "Lokesh", 18000));
			return listOfEmployees;
		}
}
