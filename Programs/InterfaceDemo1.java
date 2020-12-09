@FunctionalInterface
interface A {
	void dis1();
	default void dis2() {
		System.out.println("A interface default impl - dis2");
	}
	default void dis3() {
		System.out.println("A interface default impl - dis3");
	}
	static void dis4() {
		System.out.println("A interface Static method");
	}
	
}

class InterfaceDemo1 {
	public static void main(String args[]) {
	
	}
}