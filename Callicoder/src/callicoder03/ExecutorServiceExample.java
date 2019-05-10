package callicoder03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {

		Thread thread1 = new Thread(() ->  {
			System.out.println(Thread.currentThread() + " started!");
		});
		
		Thread thread2 = new Thread(() ->  {
			System.out.println(Thread.currentThread() + " started!");
		});

		Thread thread3 = new Thread(() ->  {
			System.out.println(Thread.currentThread() + " started!");
		});

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(thread1);
		service.execute(thread2);
		service.execute(thread3);
		
		service.shutdown();
		
	}

}
