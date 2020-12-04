package main;

import java.util.ArrayList;
import java.util.Collections;

import bean.Employee;
import bean.EmployeeSorByIdAsc;
import bean.EmployeeSortByIdDes;

public class DemoTest {

	public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("Ravi");	al.add("Mahesh");
	Collections.sort(al);
	
	ArrayList<Employee> listOfEmp = new ArrayList<Employee>();
	listOfEmp.add(new Employee(2, "Ramesh", 15000));
	listOfEmp.add(new Employee(1, "Ajay", 18000));
	listOfEmp.add(new Employee(3, "Mahesh", 12000));
	System.out.println("Before Sort");
	for(Employee e:listOfEmp) {
		System.out.println(e);
	}
	//Collections.sort(listOfEmp);
	Collections.sort(listOfEmp,new EmployeeSortByIdDes());
	System.out.println("After sort");
	for(Employee e:listOfEmp) {
		System.out.println(e);
	}
	}

}
