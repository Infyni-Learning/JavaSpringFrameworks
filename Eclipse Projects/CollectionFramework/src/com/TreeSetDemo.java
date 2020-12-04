package com;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(5);
		ts.add(7);
		ts.add(20);
		System.out.println(ts);
		System.out.println(ts.tailSet(7));
	}

}
