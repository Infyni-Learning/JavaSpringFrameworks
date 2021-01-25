package com;

import java.util.function.Consumer;

class MyConsumer implements Consumer<Float>{
	@Override
	public void accept(Float t) {
			System.out.println(t);
	}
}
public class MyConsumerDemo {
	public static void main(String[] args) {
	Consumer<Float> c1 = new MyConsumer();
	c1.accept(10.10f);
	c1.accept(20.20f);
	
	Consumer<Integer> c2 = (v)->System.out.println(v);
	c2.accept(100);
	c2.accept(200);
	}

}
