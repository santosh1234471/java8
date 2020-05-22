package lara;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteramFilterCase {
public static void main(String[] args) {
	Stream<String>my=Stream.of("one","two","three","four");
	System.out.println(my.map(String::toUpperCase).collect(Collectors.toList()));
//	Predicate<String> p1=s->s.length()>3;
//	Predicate<String>p2=s->s.equals("three");
//	my.filter(p1).filter(p2).forEach(k->System.out.println(k));
	
}
}
