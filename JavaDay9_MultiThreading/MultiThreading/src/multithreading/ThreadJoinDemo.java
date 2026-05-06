package multithreading;

class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Sita Thread");
			try

			{
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread2 t = new MyThread2();
		t.start();
		// t.join(); 
		for (int i = 0; i < 5; i++) {
			System.out.println("Rama Thread");
		}
	}
}