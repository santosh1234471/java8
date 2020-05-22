package com;

import java.util.stream.Stream;

public class StreamCase {
public static void main(String[] args) {
	Stream.of("a1","n2","u3","x2").map(s->{
		System.out.println("maping--"+s);
		return s.toUpperCase();
			})
//	.anyMatch(s->{
	.filter(s->{
				System.out.println("any match"+s);
				return s.startsWith("u3");
						}).forEach(s->System.out.println(s));
	
	Stream.of("a1","v4","b4","c").filter(s->{
		System.out.println("filter--"+s);
		return s.startsWith("a");
	}).sorted((s1,s2)->{
		System.out.printf("sort: ",s1,s2);
		return s1.compareTo(s2);
	}).map(s->{
		return s.toUpperCase();
	}).forEach(s->System.out.println(s));
}
}
