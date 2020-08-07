package golovach.lecture04.monitor;

public class CheckMutexWithoutSyncronized {

	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
					while(true) {
						System.out.println("A");
					}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
					while(true) {
						System.out.println("-- B");
					}
			}
		}).start();

	}

}
