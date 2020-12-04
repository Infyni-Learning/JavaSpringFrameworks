package com;

import java.util.HashSet;
import java.util.Iterator;

public class SetIterationDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		System.out.println(hs);
		System.out.println("For each loop");
		for(Object a:hs) {
				System.out.println(a);
		}
		Integer a = 20;
		System.out.println("Using iterator");
		        Iterator ii  = hs.iterator();
		        while(ii.hasNext()) {
		        	if(ii.next()==a) {
		        	ii.remove();
		        	}
		        }
		        	
	}

}
