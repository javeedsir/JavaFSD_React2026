package java21;

import java.util.concurrent.Executors;

public class VirtualThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            System.out.println("Running in: " + Thread.currentThread().getName());
        };

        
        Thread t= new Thread();
        
        System.out.println(t);
        
        	t.start();
        	t.join();
       
         
        Thread vt = Thread.ofVirtual().start(task);
        
        	System.out.println(vt);
        
        vt.join();
        
        
        
        
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 5; i++) {
                executor.submit(() -> {
                    System.out.println(Thread.currentThread());
                });
            }
        }

        
        
        
    }
}
