import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,2,3,4,4);
		
		List<Integer> collect = nums.stream().map(n-> n*2).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = nums.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println(collect2);
		
		//duplicate elements 
		 Set<Integer> items = new HashSet<>(); 
		List<Integer> collect3 = nums.stream().filter(n->!items.add(n)).collect(Collectors.toList());
		System.out.println(collect3);
		
		List<Integer> collect4 = nums.stream().distinct().collect(Collectors.toList());
		System.out.println(collect4);
	}
}
