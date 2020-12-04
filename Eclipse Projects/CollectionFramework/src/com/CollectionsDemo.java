package com;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
	ArrayList<String> al =new ArrayList<String>();
	al.add("Dinesh"); al.add("Ravi"); al.add("Mahesh"); al.add("Ajay"); al.add("Vijay");
	for(String name:al) {
		System.out.println(name);
	}
	Collections.sort(al);
	System.out.println("After sort");
	for(String name:al) {
		System.out.println(name);
	}
	Collections.reverse(al);
	System.out.println("Reverse Order");
	for(String name:al) {
		System.out.println(name);
	}
	}

}
