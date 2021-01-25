package com;

import java.util.function.Function;

class MyFunction implements Function<Integer, String>{
		@Override
		public String apply(Integer t) {
			return "You pass value as "+t;
		}
}
public class FunctionDemoTest {
	public static void main(String[] args) {
		Function<Integer, String> r = new MyFunction();
		System.out.println(r.apply(100));
		
		Function<Integer,Integer> r1 = (val)->val+100;
		System.out.println(r1.apply(200));
	}

}
