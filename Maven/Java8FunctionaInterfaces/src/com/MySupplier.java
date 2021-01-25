package com;

import java.util.function.Supplier;

class DemoSupplier implements Supplier<String>{
	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Welcome to Java8 Features";
	}
}
public class MySupplier {

	public static void main(String[] args) {
		Supplier<String> s = new DemoSupplier();
		System.out.println(s.get());
		
		Supplier<String> s1 = ()->"Welcome Java8 Features using Lambda Expression";
		System.out.println(s1.get());
	}

}
