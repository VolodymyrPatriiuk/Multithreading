package callicoder04;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTestWithWhile {

	public static void main(String[] args) {
		
		long elaspedTime = 0;
		long checkTime = 1000;
		
		// create callable
		Callable<String> task1 = () -> {
			System.out.println("Hi from task1: " + Thread.currentThread());
			Thread.sleep(10000);
			return "Jacob";
		};
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<String> result = service.submit(task1);
		
		String name = null;

		while(!result.isDone()) {
			System.out.println("Not ready yet :(");
			try {
				Thread.sleep(checkTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			elaspedTime += checkTime;
			if(elaspedTime > 5000) {
				System.out.println("It was decided to interrunt the task");
				result.cancel(true);
			}
		}
	
		if(!result.isCancelled()) {
			try {
				System.out.println("And now the result is ready!");
				name = result.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		} else {
			System.out.println("Task was cancelled!");
		}
		
		service.shutdown();
		
	}

}
