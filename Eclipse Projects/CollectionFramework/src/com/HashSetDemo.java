package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
class A {}
class B{}
public class HashSetDemo {

	public static void main(String[] args) {
		//HashSet hs = new HashSet();
		LinkedHashSet hs  = new LinkedHashSet();
		/*hs.add(10);		//auto-boxing 
		int a=20;
		Integer b = new Integer(a);
		hs.add(b);
		Integer c =20;
		
		hs.add(a);	//auto-boxing */
		// storing any type of values. 
		/*hs.add(100);
		hs.add(10.20);
		hs.add(true);
		hs.add("Ravi");
		hs.add(new A());
		hs.add(new B());*/
		System.out.println("Size is "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
		hs.add(200);
		hs.add(300);
		hs.add(500);
		hs.add(400);
		hs.add(400);
		hs.add(100);
		System.out.println(hs);
		System.out.println("Size is "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
		System.out.println("Search "+hs.contains(100));
		System.out.println("Search "+hs.contains(1000));
		hs.remove(100);
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
	}

}
