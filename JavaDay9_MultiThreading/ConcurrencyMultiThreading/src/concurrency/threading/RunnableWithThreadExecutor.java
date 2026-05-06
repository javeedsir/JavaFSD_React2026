package concurrency.threading;

import java.time.LocalTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class RunnableWithThreadExecutor {

	public static void main(String[] args) {


		
			Runnable  runnableTask = ()->{  // run() implementation
				
				
					try {
						TimeUnit.MILLISECONDS.sleep(1000);
						
						System.out.println(Thread.currentThread().getName());
						
						System.out.println("Current Time : "+ LocalTime.now());
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
			};
		
			//1. Single Thread Executor
			
		//	ExecutorService executorService = Executors.newSingleThreadExecutor();
			
			//   executorService.execute(runnableTask);
			
			//2. Fixed Thread Pool
			
			
			ExecutorService executorService = Executors.newFixedThreadPool(5);	
			
			
			  executorService.execute(runnableTask); executorService.execute(runnableTask);
			  executorService.execute(runnableTask); executorService.execute(runnableTask);
			  executorService.execute(runnableTask);
			 
			
			/*
			 * executorService.execute(runnableTask); executorService.execute(runnableTask);
			 * executorService.execute(runnableTask); executorService.execute(runnableTask);
			 * executorService.execute(runnableTask);
			 * 
			 * executorService.execute(runnableTask);
			 */
			
			
			
			// 3. Cached Thread Pool
			/*
			 * ExecutorService executorService = Executors.newCachedThreadPool();
			 * 
			 * 
			 * Future<String> future1 = executorService.submit(runnableTask, "DONE");
			 * Future<String> future2 = executorService.submit(runnableTask, "PENDING");
			 * 
			 * 
			 * 
			 * 
			 * 
			 * try {
			 * 
			 * 
			 * String result = future2.get();
			 * 
			 * System.out.println("Result : "+result);
			 * 
			 * System.out.println("Is Task completed ? : "+future2.isDone());
			 * 
			 * 
			 * } catch (InterruptedException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); } catch (ExecutionException e) { // TODO Auto-generated
			 * catch block e.printStackTrace(); }
			 */
			
					executorService.shutdown();
		
	}

}
