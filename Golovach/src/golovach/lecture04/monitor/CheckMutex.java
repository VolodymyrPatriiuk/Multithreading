package golovach.lecture04.monitor;

public class CheckMutex {

	public static void main(String[] args) {

		Object monitor = new Object();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("1");
				synchronized (monitor) {
					while(true) {
						System.out.println("A");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("---------- 2");
				synchronized (monitor) {
					while(true) {
						System.out.println("B");
					}
				}
			}
		}).start();

	}

}
