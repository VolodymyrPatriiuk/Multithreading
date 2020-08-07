import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class TestMap {

	public static void main(String[] args) {
		
		//System.out.println("Hello!");
		
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "Jacob");
//		map.put(2, "Joan");
//		map.put(3, "Theresa");
		
//		Set<Integer> keySet = map.keySet();
//		System.out.println(keySet);
		
		Stream.of("Jacob", "Theresa", "Anna", "jacob", "theresa", "anna")
			.sorted().forEach(s -> System.out.println(s));
		
		
	}
	
}
