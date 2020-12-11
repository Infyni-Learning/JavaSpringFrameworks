package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {

	public static void main(String[] args) {
		List<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Raj");
		listOfNames.add("Ravi");
		listOfNames.add("Ajay");
		listOfNames.add("Mahesh");
		listOfNames.add("Vijay");
		//listOfNames.add("Lookesh");
		listOfNames.add("Seeta");
		
		//listOfNames.stream().map(e->e.toUpperCase()).forEach(e->System.out.println(e));
		
	//	listOfNames.stream().forEach(e->System.out.println(e));
		
		//listOfNames.stream().filter(e->e.startsWith("R")).map(e->e.toUpperCase()).forEach(e->System.out.println(e));	  //void 
		
		//long count = listOfNames.stream().filter(e->e.startsWith("R")).map(e->e.toUpperCase()).count();
		//System.out.println(count);
		//Stream<Object> s = listOfNames.stream().filter(e->e.startsWith("R")).map(e->e.toUpperCase());
		//converting stream to list 
		//List<String> ll = listOfNames.stream().filter(e->e.startsWith("R")).map(e->e.toUpperCase()).collect(Collectors.toList());
		//System.out.println(ll);'
		//listOfNames.stream().skip(3).forEach(e->System.out.println(e));
		//listOfNames.stream().limit(3).forEach(e->System.out.println(e));
		//boolean res1 = listOfNames.stream().anyMatch(e->e.startsWith("B"));
		boolean res1 = listOfNames.stream().allMatch(e->e.contains("a"));
		System.out.println(res1);
	}

}
