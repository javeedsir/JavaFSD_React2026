package multithreading;

public class ThreadDemo extends Thread {

	public static void main(String[] args) { // main thread

		
			System.out.println("Main Thread executed");
			
			for(int i=1; i<=5; i++) {
				
				System.out.println("main "+i);
				
				
			}
			
			
			ThreadDemo  td  = new ThreadDemo();
			
					
					
					td.setPriority(MAX_PRIORITY - 1);
					td.setName("Tiger");
					
					System.out.println(td);
					
					td.start();
			
	}
	
	
	@Override
	public void run() {
		
			System.out.println("run() execution begins");
			
			for(int i=1; i<=5;i++) {
				
				
					System.out.println(Thread.currentThread().getName()+i);
				
				
			}
		
		
	}
	
	
	
	

}
