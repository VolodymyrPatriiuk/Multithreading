package callicoder02;

public class ImplementRunnable implements Runnable{

	public static void main(String[] args) {

		System.out.println("Inside the thread: " + Thread.currentThread() + ": start!");
		
		Thread thread = new Thread(new ImplementRunnable(), "Jacob-thread-01");
		thread.start();
		
		System.out.println("Inside the thread: " + Thread.currentThread() + ": finish!");

	}

	@Override
	public void run() {
		System.out.println("Inside the thread: " + Thread.currentThread());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
