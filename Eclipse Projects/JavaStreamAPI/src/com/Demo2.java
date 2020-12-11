package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> listOfRec =new ArrayList<Integer>();
		listOfRec.add(10);listOfRec.add(30);listOfRec.add(8);listOfRec.add(2);
		listOfRec.add(7);listOfRec.add(30);listOfRec.add(9);listOfRec.add(6);
		
	//Stream<Integer> ss	= listOfRec.stream();		//created the Stream 
	//Stream<Integer> ss1 = ss.distinct();				// Intermediate Operater 
	//ss1.forEach(e->System.out.println(e));			// Terminator operation 
		
		//listOfRec.stream().distinct().forEach(e->System.out.println(e));
		listOfRec.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
	}

}
