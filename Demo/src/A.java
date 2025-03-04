import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A {

	public static void main(String[] args) {

		Map<Boolean, List<Integer>> partitioned = Stream.of(1, 2, 3, 4, 5)
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));
		// System.out.println(partitioned);

		Collector<Integer, ?, String> collector = Collectors.mapping(String::valueOf, Collectors.joining(", "));
		String result = Stream.of(1, 2, 3).collect(collector);
		// System.out.println(result);

		StringBuilder sb = new StringBuilder();
		sb.append("Hello").append(" ").append("World");
		String result1 = sb.toString();
		// System.out.println(result1);

		String str = "aabga bhh aaaa dj ";
		A a1 = new A();
		long countOccurrences = a1.countOccurrences(str, 'a');
		System.out.println(countOccurrences);
		// str.chars().filter(c->c==ch).count();

	}

	long countOccurrences(String str, char ch) {
		return str.chars().filter(c -> c == ch).count();
	}

}
