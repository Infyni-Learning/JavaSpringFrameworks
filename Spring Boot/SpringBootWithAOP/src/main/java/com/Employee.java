package com;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	
	public void display() {
		System.out.println("This is business method display");
	}
	
	public void info() {
		System.out.println("This is another business method info ");
		try {
			int res = 10/1;	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
