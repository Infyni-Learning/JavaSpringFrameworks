package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer>{
	@Override
	public void accept(Integer arg0) {
		System.out.println("The value is "+arg0);
	}
}
public class Demo1 {

	public static void main(String[] args) {
		List<Integer> listOfRec =new ArrayList<Integer>();
		listOfRec.add(10);listOfRec.add(20);listOfRec.add(8);listOfRec.add(2);
		listOfRec.add(5);listOfRec.add(30);listOfRec.add(9);listOfRec.add(6);
		System.out.println("Using for each loop - Before Java8");
		for(int n:listOfRec) {
			System.out.println(n);
		}System.out.println("Using Iterator - Before Java8");
		Iterator<Integer> li = listOfRec.iterator();
		while(li.hasNext()) {
			int n = li.next();
			System.out.println(n);
		}
		System.out.println("Using Stream API forEach method");
	
		listOfRec.forEach(e->System.out.println("The value is "+e));
		//Consumer<Integer> cc = new MyConsumer();
		//listOfRec.forEach(cc);
	}

}
