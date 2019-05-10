package callicoder04;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	public static void main(String[] args) {

		// create callable
		Callable<String> task1 = () -> {
			System.out.println("Hi from task1: " + Thread.currentThread());
			Thread.sleep(3000);
			return "Jacob";
		};
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<String> result = service.submit(task1);
		
		String name = null;
		try {
			name = result.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println(name);
		
		service.shutdown();
		
	}

}
