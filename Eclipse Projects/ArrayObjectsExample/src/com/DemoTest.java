package com;

import java.util.Scanner;

import bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("how many records do you want to store?");
		int n = sc.nextInt();
		Employee emps[]=new Employee[n];		//array object. 
		System.out.println("Plz enter the records one by one");
		for(int i=0;i<n;i++) {
			emps[i]=new Employee();
			System.out.println("Enter the id");
			int id = sc.nextInt();
			emps[i].setId(id);
			System.out.println("Enter the name");
			String name = sc.next();
			emps[i].setName(name);
			System.out.println("Enter the salary");
			float salary = sc.nextFloat();
			emps[i].setSalary(salary);
		}
		System.out.println("All Employee records are ");
		/*for(int i=0;i<n;i++) {
			System.out.println("Id is "+emps[i].getId());
			System.out.println(emps[i]);		//toString()
		}*/
		int flag = 0;
		int count=0;
		System.out.println("Enter the employee id ");
		int searchId = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(emps[i].getId()==searchId) {
				flag = i;
				count++;
				break;
			}
		}
		if(count>0) {
		Employee emp = emps[flag];
		System.out.println(emp);
		}else {
			System.out.println("Record not present");
		}
	/*Employee emp = new Employee();
	emp.setId(100);
	emp.setName("Ravi");
	emp.setSalary(24000);
	System.out.println("id is "+emp.getId());
	System.out.println("name is "+emp.getName());
	System.out.println("salary is "+emp.getSalary());
	
	Employee emp1 = new Employee(101, "Ramesh", 26000);
	System.out.println("id is "+emp1.getId());
	System.out.println("name is "+emp1.getName());
	System.out.println("salary is "+emp1.getSalary());
	
	System.out.println(emp);			// internally it will toString() of Object class. */
		
	}

}
