package multithreading;

class UserThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class ThreadYieldDemo {
	public static void main(String[] args) {
		UserThread t1 = new UserThread();
		t1.start();
		
		UserThread t2 = new UserThread();
		t2.start();
		
	}
}