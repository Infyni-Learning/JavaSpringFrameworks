package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value = "allEmployee",
			produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET)
	public List<Employee> getAllEmployeeDetails() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(1, "Ravi", 14000));
		listOfEmp.add(new Employee(2, "Ramesh", 16000));
		listOfEmp.add(new Employee(3, "Rajesh", 18000));
		listOfEmp.add(new Employee(4, "Lokesh", 20000));
		return listOfEmp;
	}
	
	//http://localhost:8080/SpringRest/query?name=Ravi
	//Query Param 
	@RequestMapping(value = "query",method = RequestMethod.GET)
	public String getQueryParam(@RequestParam("name") String fname) {
		return "Welcome to Spring Rest "+fname;
	}
	
		//http://localhost:8080/SpringRest/path/Ramesh
		//Path Param 
		@RequestMapping(value = "path/{name}",method = RequestMethod.GET)
		public String getPathParam(@PathVariable("name") String fname) {
			return "Welcome to Spring Rest "+fname;
		}
		
//		http://localhost:8080/SpringRest/empStore		
		@RequestMapping(value = "empStore",
				method = RequestMethod.POST,
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.APPLICATION_JSON_VALUE)
		public Employee storeEmployee(@RequestBody Employee emp) {
			System.out.println(emp);
			//emp.setSalary(emp.getSalary()+2000);
			return emp;
		}
	// http://localhost:8080/SpringRest/empUpdate
		@RequestMapping(value = "empUpdate",
				method = RequestMethod.PUT,
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.APPLICATION_JSON_VALUE)
		public Employee updateEmployee(@RequestBody Employee emp) {
			System.out.println(emp);
			emp.setSalary(emp.getSalary()+2000);
			return emp;
		}
//		http://localhost:8080/SpringRest/empDelete/100
		@RequestMapping(value = "empDelete/{id}",
				method = RequestMethod.DELETE)
		public String deleteInfo(@PathVariable("id") int id) {
			return "Record deleted by id "+id;
		}
		
		
		@Autowired
		EmployeeService employeeService;
		
		@RequestMapping(value = "employeeDb",
				method = RequestMethod.GET,
				produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Employee> getEmployeeFromDb() {
			
				return employeeService.getEmployee();
		}
}


