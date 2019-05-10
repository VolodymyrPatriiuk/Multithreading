package callicoder02;

public class ExtendTheThread extends Thread{

	public ExtendTheThread(String name) {
		super(name);
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
	
	public static void main(String[] args) {

		System.out.println("Inside the thread: " + Thread.currentThread() + ": start!");
		
		ExtendTheThread thread = new ExtendTheThread("Jacob-thread-01");
		thread.start();
		
		System.out.println("Inside the thread: " + Thread.currentThread() + ": finish!");

	}

}
