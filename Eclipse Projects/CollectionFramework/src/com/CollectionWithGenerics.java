package com;

import java.util.ArrayList;

public class CollectionWithGenerics {

	public static void main(String[] args) {
		//Collection without Generics 
		/*ArrayList al = new ArrayList();
			al.add(10);				//auto-boxing 
			al.add("Raj");
			al.add(true);
			al.add(10.20);
			al.add(20);
			
			Object obj = al.get(1);				//instanceOf 
			Integer i = (Integer)obj;
			int n = i.intValue();
			System.out.println(n);*/
		/*ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);				// auto-boxing 
		al.add(20);
		al.add(30);
		
		int n = al.get(0);			// auto-unboxing -- convertig object to primitive 
		System.out.println(n);*/
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		//System.out.println(al.get(0)+al.get(1));
		Object obj1 = al.get(0);
		Object obj2 = al.get(1);
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		System.out.println(i1+i2);		//auto-unboxing 
	}

}
