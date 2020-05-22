package com;

import java.util.Optional;

public class OptionalCase {
public static void main(String[] args) {
	String g[]=new String[10];
	Optional<String>o=Optional.ofNullable(g[9]);
	if(o.isPresent()) {
		String str=g[9].substring(2, 5);
		System.out.println(str);
	}else {
		System.out.println("not");
	}
}
}
