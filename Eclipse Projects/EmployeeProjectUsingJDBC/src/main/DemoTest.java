package main;

import java.util.List;
import java.util.Scanner;

import bean.Employee;
import service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {		//main class interact with View 
		Scanner sc = new Scanner(System.in);
		EmployeeService es = new  EmployeeService();
		System.out.println("1:Add, 2 : Display");
		int con = sc.nextInt();
		if(con==1) {
			System.out.println("Enter the id");
			int id = sc.nextInt();
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the salary");
			float salary = sc.nextFloat();
			Employee emp = new Employee(id, name, salary);
			String res = es.storeEmployee(emp);
			System.out.println(res);
		}else if(con==2) {
		List<Employee>	 listOfEmployee	= es.getAllEmployee();
		for(Employee emp : listOfEmployee) {
			System.out.println(emp);
		}
		}else {
			System.out.println("Wrong choice");
		}
		System.out.println("Thank you!");
	}

}
