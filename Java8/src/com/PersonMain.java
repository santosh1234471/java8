package com;

import java.util.Arrays;
import java.util.List;

public class PersonMain {
public static void main(String[] args) {
	List<Person>l=Arrays.asList(new Person("sany",1234),new Person("sachin",50000),new Person("nilesh",4444));
	Person p=l.stream().filter(m ->"nilesh".equals(m.getName())&& 4444==m.getSalary()).findAny().orElse(null);
	System.out.println(p);
}
}
