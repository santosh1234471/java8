package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {
public static void main(String[] args) {
	List<String>l=Arrays.asList("a","b","c2","d","c1");
	//l.stream().filter(s->s.startsWith("c")).map(s->s.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
	l.stream().filter(s->s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
	Arrays.asList("a1","a2","a3").stream().findFirst().ifPresent(System.out::println);
	Stream.of("s","g","y").findAny().ifPresent(System.out::println);
	//IntStream.range(1, 5).forEach(System.out::println);
	Arrays.stream(new int[] {1,2,3}).map(n->n*2+1).average().ifPresent(System.out::println);
	Stream.of("a1","a2","a3").map(s->s.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
	IntStream.range(1, 3).mapToObj(i->"a"+i).forEach(System.out::println);
	Stream.of(1.0,2.0,3.0).mapToInt(Double::intValue).mapToObj(i->"a"+i).forEach(System.out::println);
	
	Stream.of("a1","b2","c4","b7").filter(s->{
		System.out.println("filter--"+s);
		return true;
	}).forEach(m->System.out.println(m));
	
	Stream.of("123").mapToInt(Integer::parseInt).forEach(System.out::println);
}
}
