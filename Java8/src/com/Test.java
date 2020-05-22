package com;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {
public static void main(String[] args) {
	String s="hello";
	Optional o=Optional.empty();
//	if(o.ifPresent(s))
//		{
//		System.out.println(o.get());
//		};
	Consumer<String> s1=s2->System.out.println(s2);
	s1.accept(s);
	
	Supplier<String>d=()->{ return "welcome";};
	System.out.println(d.get());
}
}
