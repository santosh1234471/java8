package lara;

import java.util.Arrays;
import java.util.List;

class Person{
	private String name;

	public Person(String name) {
		this.name=name;
	}
	public void print() {
		System.out.println(name);
	}
	
}
public class PersonMethodRefer {
public static void main(String[] args) {
	List<Person>p=Arrays.asList(new Person("sany"),new Person("vijay"));
	p.forEach(Person::print);
	p.forEach(person->person.print());
	for(Person k:p) {
		k.print();
	}
}
}
