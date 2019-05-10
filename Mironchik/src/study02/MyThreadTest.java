package study02;

import java.util.Arrays;
import java.util.List;

public class MyThreadTest {

	public static void main(String[] args) {
		
		System.out.println("Thread " + Thread.currentThread() + " started!");
		
		List<MyThread> threads = Arrays.asList(
				new MyThread("thread1"), 
				new MyThread("thread2"),
				new MyThread("thread3")
				);
		
		threads.stream().forEach(thread -> {
			try {
				thread.getThread().join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		System.out.println("Thread " + Thread.currentThread() + " finished!");

	}

}
