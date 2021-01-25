package com;
class Employee implements AutoCloseable{
	void display() {
		System.out.println("business method");
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("close method called..");
	}
}
public class TryWithUserdefinedResource {
	public static void main(String[] args) {
	try(Employee emp = new Employee()) {
		emp.display();
	}catch(Exception e) {}
	}
}
