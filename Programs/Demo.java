class Abc implements Runnable{
	
	@Override
	public synchronized void run() {
	Thread t = Thread.currentThread();	
	String name = t.getName();
		for(int i=0;i<10;i++) {
			try{
			Thread.sleep(500);
			if(name.equals("Ravi") && i==5) {
				wait();
			}	
			if(name.equals("Vijay") && i==6) {
				wait();
				notify();
			}		
			System.out.println(name+" "+i);

			
			}catch(Exception e){}
		}			
	}
}
class Demo {
	public static void main(String args[]) {
	Abc b1 = new Abc();		
	
	
	Thread t1 = new Thread(b1);
	Thread t2 = new Thread(b1);
	Thread t3 = new Thread(b1);	
	
	t1.setName("Ravi");
	t2.setName("Ajay");
	t3.setName("Vijay");

	t1.start();
	t2.start();
	t3.start();
	}
}