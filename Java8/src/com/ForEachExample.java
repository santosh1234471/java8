package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer>{
	public void accept(Integer t) {
		System.out.println("consumer value--"+t);
	}
}
public class ForEachExample {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>();
	for(int i=0;i<10;i++) {
		l.add(i);
	}
	l.forEach(new Consumer<Integer>() {
		public void accept(Integer u) {
			System.out.println("for Each annynomus--"+u);
		}
	});
	
	MyConsumer m=new MyConsumer();
	l.forEach(m);
}
}
