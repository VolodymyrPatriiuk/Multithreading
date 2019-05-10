package study02;

public class MyThread implements Runnable{

	private Thread thread;
	
	public MyThread(String name) {
		thread = new Thread(Thread.currentThread().getThreadGroup(), this, name);
		thread.start();
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				//Thread.sleep(1000);
				Thread.sleep( (long)(Math.random()*2000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread() + ": " + i);
		}
	}
	
	public Thread getThread() {
		return thread;
	}

}
