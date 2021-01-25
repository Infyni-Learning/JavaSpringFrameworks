package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodDemo {

	public static void main(String[] args) {
	List<String> stdNames = new ArrayList<String>();
	stdNames.add("Ravi"); stdNames.add("Seeta");stdNames.add("Reeta");stdNames.add("Ajay");
	stdNames.add("Ramu"); stdNames.add("Teeta");stdNames.add("Lokesh");stdNames.add("Vijay");
	System.out.println("Using for each loop");
	for(String name:stdNames) {
		System.out.print(name+" ");
	}
	System.out.println();
	System.out.println("Using Iterator");
	Iterator<String> li = stdNames.iterator();
	while(li.hasNext()) {
		String name = li.next();
		System.out.print(name+" ");
	}
	System.out.println();
	System.out.println("Using Constumer with Lambda Expression");
	stdNames.forEach(val->System.out.print(val+" "));
	}

}
