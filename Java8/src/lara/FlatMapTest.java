package lara;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {
public static void main(String[] args) {
	List<List<String>> l=Arrays.asList(Arrays.asList("one:one"),Arrays.asList("two:three"),Arrays.asList("one:four"));
	List<String>d=l.stream().flatMap(Collection::stream).collect(Collectors.toList());
	//System.out.println(d);
	List<String>h=d.stream().map(s->s.substring(0,s.indexOf(":"))).collect(Collectors.toList());
	System.out.println(h);
}
}
