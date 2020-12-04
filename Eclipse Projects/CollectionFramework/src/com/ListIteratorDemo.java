package com;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		ListIterator li = al.listIterator();
		System.out.println("Forward direction");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Backward direction");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
