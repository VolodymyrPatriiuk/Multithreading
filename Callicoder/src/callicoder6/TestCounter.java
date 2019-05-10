package callicoder6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestCounter {

	private static int NUM = 1000;
	
	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();
		ExecutorService service = Executors.newCachedThreadPool();

		for(int i = 0; i < NUM; i++) {
			service.execute(() -> {counter.increment();}); 
		}
		
		service.shutdown();
		service.awaitTermination(10, TimeUnit.SECONDS);
		
		System.out.println("with threads: " + counter.getCounter());
	}

}
