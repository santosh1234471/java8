package lara;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {
public static void main(String[] args) {
	List<String>l=Arrays.asList("Programming","in","java","interview");
	//l.stream().map(s->s.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
	
	//l.stream().filter(e->e.startsWith("i")).collect(Collectors.toList()).forEach(System.out::println);
	
	l.stream().reduce((s, s2)->s.concat(s2+"-"));
	System.out.println(l);
	//System.out.println(l);
	List<Integer>m=new ArrayList<Integer>();
	m.add(1);
	m.add(2);
	m.add(3);
	m.add(4);
	m.remove(2);
	System.out.println(m);
}
}
