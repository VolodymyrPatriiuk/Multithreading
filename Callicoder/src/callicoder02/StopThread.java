package callicoder02;

public class StopThread {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			System.out.println(Thread.currentThread() + " started!" );
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread() + ": A'm interrupted!" + e.getMessage());
				try {
					throw new InterruptedException();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread() + " finished!" );
		};
		
		Thread thread = new Thread(runnable, "Thead-to-stop");
		thread.start();
		thread.interrupt();
		
		
	}

}
