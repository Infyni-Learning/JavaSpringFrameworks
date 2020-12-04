package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	Stack ss = new Stack();
	ss.push(100);
	ss.push(200);
	ss.push(300);
	ss.push(400);
	System.out.println(ss);
	System.out.println("top "+ss.pop());		//remove top element from stack 
	System.out.println(ss);
	System.out.println("check top most element "+ss.peek());
	System.out.println(ss);
	System.out.println("Search "+ss.search(200));
	System.out.println("Search "+ss.search(50));

	}

}
