package com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(100);
	al.add("Ravi");
	al.add(200);
	al.add(300);
	al.add(400);
	System.out.println(al);
	System.out.println("Get the value using index "+al.get(1));
	System.out.println("Get the value using index "+al.get(2));
	al.add(1, "Ramesh");		//added on specific position 
	System.out.println("Get the value using index "+al.get(1));
	System.out.println("Get the value using index "+al.get(2));
	al.set(1, "Raju");				// replace on specific position 
	System.out.println("Get the value using index "+al.get(1));
	System.out.println("Get the value using index "+al.get(2));
	al.remove(1);
	System.out.println("Get the value using index "+al.get(1));
	}

}
