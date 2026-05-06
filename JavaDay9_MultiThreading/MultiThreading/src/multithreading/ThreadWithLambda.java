package multithreading;

public class ThreadWithLambda {

	public static void main(String[] args) {


	Runnable  runnable = ()->{ System.out.println(Thread.currentThread().getName());   };
		
			Thread t1 = new Thread(runnable, "child1");
			
			t1.start();
		

	}

}
