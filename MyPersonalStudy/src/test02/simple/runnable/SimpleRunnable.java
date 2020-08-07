package test02.simple.runnable;

public class SimpleRunnable {

	public static void main(String[] args) throws InterruptedException {

		Thread r1 = new Thread(new Thread1());
		Thread r2 = new Thread(new Thread2());
		
		long t1 = System.currentTimeMillis();
		r1.start();
		r1.join();
		r2.start();
		r2.join();
		long t2 = System.currentTimeMillis();
		System.out.println("dt = " + (t2 - t1) + " ms");
		
	}

}


class Thread1 implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i < 1000; i++) {
			System.out.println("It's Thread1: " + i);
		}
	}
}

class Thread2 implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i < 1000; i++) {
			System.out.println("---- It's Thread2: " + i);
		}
	}
}