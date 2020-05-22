package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class STreamTest {
public static void main(String[] args) {
	ArrayList<Integer> l = new ArrayList<Integer>();
	l.add(0); l.add(10); l.add(20);
	l.add(5);l.add(15);l.add(25);

   l.stream().filter(i ->i%2==0).collect(Collectors.toList());
   System.out.println(l);
   
   long m=l.stream().map(i ->i*2).sorted().count();//collect(Collectors.toList());
   System.out.println(m);
   
}
}
