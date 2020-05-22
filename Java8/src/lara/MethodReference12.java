package lara;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReference12 {
public static void main(String[] args) {
	List<String>l=Arrays.asList("1","2","3");
	List<Integer>k=l.stream().map(new Function<String, Integer>() {
		public Integer apply(String s) {
			return Integer.parseInt(s);
		}
	}).collect(Collectors.toList());
	System.out.println(k);
	List<Integer>m=l.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());
	System.out.println(m);
	List<Integer>z=l.stream().map(Integer::parseInt).collect(Collectors.toList());
	System.out.println(z);
}
}
