package callicoder03;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorTest {

	public static void main(String[] args) {

		Runnable task = () -> {
			System.out.println("Task1 started: " + Thread.currentThread().getName() + ": " + System.nanoTime());
		};

		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		
		// task will start at 10 seconds
		//service.schedule(task, 10, TimeUnit.SECONDS);
		
		// task will start periodically every 2 seconds
		service.scheduleAtFixedRate(task, 0, 2, TimeUnit.SECONDS);

		//service.shutdown();
	}
}