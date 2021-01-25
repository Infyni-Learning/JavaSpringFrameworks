package com;

import java.util.function.Predicate;

class MyPredicate implements Predicate<Integer>{
	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t>100;
	}
}
public class PredicateDemoTest {
	public static void main(String[] args) {
		Predicate<Integer> p1 = new MyPredicate();
		System.out.println(p1.test(50));
		System.out.println(p1.test(150));
		
		Predicate<String> p2 = (name)->name.length()>10;
		System.out.println(p2.test("Ravi Kumar"));
		System.out.println(p2.test("Ajay Kumar Patil"));
	}

}
