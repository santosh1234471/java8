package lara;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReference {
public static void main(String[] args) {
	List<Integer>l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	//l.forEach(StaticMethodReference::print);
	l.forEach(n->StaticMethodReference.print(n));
	for(int p:l) {
		StaticMethodReference.print(p);
	}
	
}
public static void print(final int number) {
	System.out.println("number is--"+number);
}
}
