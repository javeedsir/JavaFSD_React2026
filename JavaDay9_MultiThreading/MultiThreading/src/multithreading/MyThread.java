package multithreading;

public class MyThread  implements Runnable {

	public static void main(String[] args) {

		Runnable mt1 = new MyThread();

		Thread t1 = new Thread(mt1); // HAS A Relationship

			t1.setName("child1");
		t1.start();

		Thread t2 = new Thread(mt1 , "child2"); // HAS A Relationship

		t2.start();

	}

	@Override
	public void run() {

		System.out.println("run() executed by thread");
		System.out.println(Thread.currentThread().getName());

	}

}
