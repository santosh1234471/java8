package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExmple {
public static void main(String[] args) {
	List<Integer>l=new ArrayList<Integer>();
	for(int i=0;i<12;i++) {
		l.add(i);
	}
	Stream<Integer> seq=l.stream();
	Stream<Integer>parl=l.parallelStream();
	Stream<Integer> sd=parl.filter(i->i>8);
	sd.forEach(p -> System.out.println(p));
	
	System.out.println("-----------");
	Stream<Integer>fg=seq.filter(z -> z>3);
	fg.forEach( h -> System.out.println(h));
}
}
