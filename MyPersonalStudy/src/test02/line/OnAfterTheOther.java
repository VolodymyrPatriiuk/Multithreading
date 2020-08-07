package test02.line;

/*
 * Спочатку друкує один, потім інший
 */

public class OnAfterTheOther {

	public static void main(String[] args) {
		
		Object monitor = new Object();
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();

		synchronized (monitor) {
			t1.start();
		}

		t2.start();
	}

}


class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i = 1; i < 1000; i++) {
			System.out.println("It's Thread1: " + i);
		}
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i = 1; i < 1000; i++) {
			System.out.println("  It's Thread2: " + i);
		}
	}
}
