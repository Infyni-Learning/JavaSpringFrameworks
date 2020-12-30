package com;

public class Employee {
private int id;
private String name;
private float salary;
private Address add;
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Object created....");
		this.id = 100;
		this.name = "Unknown";
		//this.salary =8000;
	}
	
	
	public Address getAdd() {
		return add;
	}


	public void setAdd(Address add) {
		this.add = add;
	}


	public Employee(int id, String name, float salary) {
		System.out.println("Patameterized constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Business method");
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}


	
}
