package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predicat {
public static void main(String[] args) {
	List<String>l=new ArrayList<String>();
	l.add("Oliver");
	l.add("Jack");
	l.add("Jacob");
	l.add("Harry");
	l.add("charlie");
	l.add("James");
	boolean p=l.add("sany");
	
	Consumer<String>c=s->System.out.println(s);
	c.accept("well");
	System.out.println(c);
	
	Supplier<String> s=()-> {return "welcome";};
	System.out.println(s.get());
	
	Supplier<String> s1=()->{
		String d[]= {"sonu","monu","tonu"};
	
	int x=(int)Math.random()*2+1;
	return d[x];
	};
	System.out.println(s1.get());
}
}
