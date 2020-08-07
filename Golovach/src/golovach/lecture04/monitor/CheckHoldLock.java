package golovach.lecture04.monitor;

public class CheckHoldLock {

	
	public static void main(String[] args) throws InterruptedException {

		Object monitor = new Object();
		
		synchronized (monitor) {
			monitor.notify();
			System.out.println(Thread.holdsLock(new Object()));
		}
		
	}

}
