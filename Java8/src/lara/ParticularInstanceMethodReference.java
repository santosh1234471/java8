package lara;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ParticularInstanceMethodReference {
public static void main(String[] args) {
	Function<String, Integer>f=Integer::valueOf;
	System.out.println(f.apply("123"));
	Function<Integer, String>m2=String::valueOf;
	Integer d=789;
	Function<Integer, String>z=s->String.valueOf(d);
	System.out.println(z.apply(d));
	System.out.println(m2.apply(456));
//	String[] i= {"1","2","3"};
//	int i1[]= {1,2,3};
//	s->String.valueof(i);
	List<Integer>l=Arrays.asList(1,34,3,4,5,6,7,8,9,10);
	final MyComparator m=new MyComparator();
	Collections.sort(l, m::compare);
	Collections.sort(l, (a,b)->m.compare(a, b));
	System.out.println(l);
	
}
private static class MyComparator {
    public int compare(final Integer a, final Integer b) {
        return a.compareTo(b);
    }
}
}
