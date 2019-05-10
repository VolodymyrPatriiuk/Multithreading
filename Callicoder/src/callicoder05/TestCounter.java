package callicoder05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestCounter {

	private static int NUM = 1000;
	
	public static void main(String[] args) throws InterruptedException {

		// var1 - without threads
//		for(int i = 0; i < NUM; i++) {
//			new Counter();
//		}
//		System.out.println("without threads: " + Counter.counter);
	
		// var2 - with threads
		Counter counter = new Counter();
		ExecutorService service = Executors.newCachedThreadPool();
		//ExecutorService service = Executors.newSingleThreadExecutor();

		for(int i = 0; i < NUM; i++) {
			service.execute(() -> {counter.increment();}); 
		}
		
		service.shutdown();
		service.awaitTermination(10, TimeUnit.SECONDS);
		
		System.out.println("with threads: " + counter.getCounter());
	}

}
