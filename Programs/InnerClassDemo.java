@FunctionalInterface
interface Operation {
	int add(int x, int y);
}
class InnerClassDemo {
	public static void main(String args[]) {
	
	Operation op1 = (x,y)->x+y;		//by default return the value. 
	
	System.out.println(op1.add(100,200));

	Operation op2 = (int x,int y)->x+y;				

	System.out.println(op2.add(1000,2000));

	Operation op3 = (int a,int b)->a+b;				

	System.out.println(op3.add(10,20));
	
	Operation op4 = (a,b)-> {
			int sum = a+b;
			return sum;
		};

	System.out.println(op4.add(1,2));
	}
}