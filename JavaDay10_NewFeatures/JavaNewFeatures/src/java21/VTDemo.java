package java21;

import java.util.concurrent.Executors;

public class VTDemo {
	
	public static void main(String[] args) {
		
	 var x = 10; // int x = 10;
	 
	 
		
	
	// Create and start a virtual thread
	Thread.ofVirtual().start(() -> {
	    System.out.println("Hello from a virtual thread!");
	});

	// Or use an ExecutorService specifically for virtual threads
	try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
	    executor.submit(() -> {
	        // Your I/O-heavy task here
	    });
	}
	

	
	
	}
}
