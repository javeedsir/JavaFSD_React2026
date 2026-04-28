package checked;

public class Demo {

	public static void main(String[] args) { // main thread


			System.out.println("Welcome");
		
		     try {
				Thread.sleep(2000);  // 2 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
			System.out.println("Thank you");
		
		
		
		
	}

}
