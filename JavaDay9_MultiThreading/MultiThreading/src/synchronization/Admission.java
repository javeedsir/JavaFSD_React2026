package synchronization;

public class Admission implements Runnable {

	static int seats = 1;

	public static void main(String[] args) {

		Runnable admission = new Admission();

		Thread t1 = new Thread(admission);
		t1.setName("Raju");

		Thread t2 = new Thread(admission);
		t2.setName("Satish");

		System.out.println("No. of seats before " + seats);

		t1.start();
		t2.start();

	}

	@Override
	public synchronized void run() {

		if (seats > 0) {

			System.out.println("Seat allocated to the " + Thread.currentThread().getName());

			seats--;

			System.out.println("No. of seats after " + seats);

		}

		else {

			System.err.println("Sorry " + Thread.currentThread().getName() + " No more seats available try next year");

		}

	}

}
