package concurrency.threading;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableWithThreadExecutor {

	public static void main(String[] args) {

		// Demo Callable task

		Callable<String> callableTask = () -> { // implementation of call()
			TimeUnit.MILLISECONDS.sleep(1000);
			

			System.out.println(Thread.currentThread().getName());
			return "Current time :: " + LocalDateTime.now();
		};

		// Executor service instance
		//ExecutorService executor = Executors.newFixedThreadPool(3); // 2 thread completes all six tasks

			ExecutorService  executor = Executors.newCachedThreadPool();
		
		List<Callable<String>> tasksList = Arrays.asList(callableTask, callableTask, callableTask, callableTask,
				callableTask, callableTask , callableTask,callableTask);

		try {
			List<Future<String>> results = executor.invokeAll(tasksList);
			
			for(Future<String> future:results) {
				
		System.out.println("Result of Each Future from Each Task : "+future.get());

				
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(ExecutionException e) {
			
			e.printStackTrace();
		}
		
		
				executor.shutdownNow();
	}

}
