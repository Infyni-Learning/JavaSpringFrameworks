package com;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int abc[]= {5,2,6,8,5,1};
		System.out.println("Using for loop");
		for(int a:abc) {
			System.out.println(a);
		}
		
		Arrays.sort(abc);
		System.out.println("After sort");
		for(int a:abc) {
			System.out.println(a);
		}
		
	}

}
