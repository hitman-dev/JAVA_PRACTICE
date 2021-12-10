package DAY_18.JAVA_8_FEATURES.com.demo.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClassStreams {
	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(3,1,4,5,6,3,7,8);
		Stream<Integer> s=lst.stream();
		Optional<Integer> op=s.min(Integer::compare);
		if(op.isPresent()) {
		     System.out.println(op.get());
		}
		else {
			System.out.println("not found");
		}
		
		Optional<Integer> m= Optional.ofNullable(lst.stream().reduce(1, (a, b) -> a * b));
		System.out.println("multiplication is : "+m);

		m = lst.stream().reduce((a, b) -> a * b);
		System.out.println("multiplication is : "+m);
		List<Integer> squarelst=lst.stream().map(x->x*x).collect(Collectors.toList());
		
		Optional<Integer> first=lst.stream().filter(x->x%5==0).findFirst();
		System.out.println("find first divisible number: "+first.get());
		
	}

}
