package callicoder05;

public class Counter {

	private int counter = 0; 
	
	// or synchornize all method
	public void increment() {
		synchronized (this) {
			counter++;
		}
	}

	public int getCounter() {
		return counter;
	}

}