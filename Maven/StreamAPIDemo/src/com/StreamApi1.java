package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi1 {

	public static void main(String[] args) {
	List<Integer> ll = new ArrayList<>();
	for(int i=1;i<=100;i++) {
		ll.add(i);
	}
	System.out.println("Sizes is "+ll.size());
	int sum=0;
	int sumOfEven =0;
	for(int n:ll) {
		sum = sum+n;
		if(n%2==0) {
		sumOfEven  = sumOfEven+n;
		}
	}
	System.out.println("Sum is "+sum);
	System.out.println("Sum of even "+sumOfEven);
	System.out.println("using Stream");
	      /*Stream<Integer> ss = ll.stream();
	      ss.forEach(v->System.out.println(v));
	      ss.forEach(vv->System.out.println(vv));*/
	
	//ll.stream(). forEach(v->System.out.println(v));
	int sumOfNum = ll.stream().mapToInt(t->t).sum();
	int sumOfEvenNumber = ll.stream().filter(t->t%2==0).mapToInt(t->t).sum();
	System.out.println("Sum of number is "+sumOfNum);
	System.out.println("Sum of even number is "+sumOfEvenNumber);
	}

	
	
	
	
	
}
