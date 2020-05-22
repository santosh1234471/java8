package com;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Person1 {
String name;
int age;
public Person1(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "Person1 [name=" + name + ", age=" + age + "]";
}
public static void main(String[] args) {
	List<Person1>p=Arrays.asList(new Person1("nax", 18),new Person1("sany",34),new Person1("David", 30));
	List<Person1>k=p.stream().filter(s->s.name.startsWith("D")).collect(Collectors.toList());
	System.out.println(k);
	Map<Integer, List<Person1>>a=p.stream().collect(Collectors.groupingBy(z->z.age));
	a.forEach((age,g)->System.out.format("age %s: %s\n",age,g));
	Double h=p.stream().collect(Collectors.averagingInt(v->v.age));
	System.out.println(h);
	IntSummaryStatistics x=p.stream().collect(Collectors.summarizingInt(c->c.age));
	System.out.println(x);
	String u=p.stream().filter(j->j.age>17).map(o->o.name).collect(Collectors.joining("and","in germany","are age"));
	System.out.println(u);
	Map<Object, Object>f=p.stream().collect(Collectors.toMap(b->b.name, b->b.age,(name1,name2)->name1+";"+name2));
	System.out.println(f);
}
}
