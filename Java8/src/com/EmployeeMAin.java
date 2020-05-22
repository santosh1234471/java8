package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMAin {
public static void main(String[] args) {
	List<Employee>l=new ArrayList<Employee>();
	l.add(new Employee("sany", 1234));
	l.add(new Employee("Sachin",45000));
	l.add(new Employee("Nilesh",55000));
	l.add(new Employee("Sanjay",65000));

   List s=l.stream().filter(emp ->emp.getSalary()>50000).collect(Collectors.toList());
   System.out.println(s);
   List revise=l.stream().map(emp ->emp.getSalary()*2).collect(Collectors.toList());
   System.out.println(revise);
}
}
