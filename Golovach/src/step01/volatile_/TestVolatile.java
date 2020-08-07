package step01.volatile_;

public class TestVolatile {

	private static volatile boolean flag = true;
	
	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				while(flag) {
					System.out.println("I'm working...");
				};
				
			}
		});
		
		//thread.setDaemon(true);
		thread.start();
		
		System.out.println("thread = " + thread.getName());
		
		System.out.println(Thread.currentThread().getName());
		flag = false;
		
		// test
		final int availableProcessors = Runtime.getRuntime().availableProcessors();
		System.out.println("availableProcessors = " + availableProcessors);

	
	}
}
