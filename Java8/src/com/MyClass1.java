package com;

public class MyClass1 implements Interface1,Interface2{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
	}
	public void log(String str) {
		System.out.println("myClass--"+str);
		Interface1.print("hello");
	}
	public static void main(String[] args) {
		Interface1 i=(s)->System.out.println(s);
		i.method1("welcome");
	}

}
