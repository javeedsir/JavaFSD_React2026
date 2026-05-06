package multithreading;

import java.util.Iterator;

public class MultiThreads extends Thread  {

	public static void main(String[] args) {

		MultiThreads t1 = new MultiThreads();

		t1.setPriority(NORM_PRIORITY);
		t1.setName("Child1");

		MultiThreads t2 = new MultiThreads();

		t2.setPriority(NORM_PRIORITY);
		t2.setName("Child2");

		
			t1.start();
			t2.start();
		
		
	}

	@Override
	public void run() {
		
			for(int i=0; i<5; i++) {
				
				
				System.out.println(Thread.currentThread().getName());
				
				
			}
		

	}

}
