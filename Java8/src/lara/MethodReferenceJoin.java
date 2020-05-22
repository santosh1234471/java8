package lara;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class IntegerUtils{
	public static String play(Integer a,Integer b) {
		return String.valueOf(a+b);
	}
}
public class MethodReferenceJoin {
public static void main(String[] args) {
	String r1=IntegerUtils.play(1, 2);
	
	List<String>l=Arrays.asList("san","wer");
	l.stream().map(String::toUpperCase).collect(Collectors.toList());
	System.out.println(l);
}
}
