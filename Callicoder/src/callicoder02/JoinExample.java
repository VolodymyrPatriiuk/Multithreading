package callicoder02;

public class JoinExample {

	public static void main(String[] args) {
		Object o;
		System.out.println(Thread.currentThread() + " starting...");
		
		Thread thread1 = new Thread(() ->  {
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		Thread thread2 = new Thread(() ->  {
			System.out.println(Thread.currentThread());
		});

		thread1.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread2.start();

		System.out.println(Thread.currentThread() + " finished.");
		
		
	}

}
