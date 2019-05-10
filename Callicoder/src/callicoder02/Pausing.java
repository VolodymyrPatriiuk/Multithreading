package callicoder02;

import java.util.Arrays;
import java.util.List;

public class Pausing {

	public static void main(String[] args) {

		List<String> poem = Arrays.asList("If I can stop one heart from breaking,", "I shall not live in vain.",
				"If I can ease one life the aching,", "Or cool one pain,", "Or help one fainting robin",
				"Unto his nest again,", "I shall not live in vain");

		Thread thread = new Thread(() -> {
			poem.stream().forEach(s -> {
				System.out.println(s);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			);
		});

		thread.start();

	}

}
