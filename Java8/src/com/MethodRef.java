package com;

import java.util.Arrays;
import java.util.function.BiFunction;

class Multi{
	public static int multiply(int a,int b) {
		return a*b;
	}
}
public class MethodRef {
public static void main(String[] args) {
	BiFunction<Integer, Integer, Integer> b=Multi::multiply;
	int g=b.apply(2, 4);
	System.out.println(g);
	
	String s[]= {"san","ert","qwer"};
	Arrays.sort(s,String::compareToIgnoreCase);
	for(String h:s) {
		System.out.println(h);
	}
}
}
