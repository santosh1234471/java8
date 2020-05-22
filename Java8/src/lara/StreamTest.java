package lara;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.Employee;

public class StreamTest {


public static void main(String[] args) {
	List<Employee1>e=new ArrayList();
	e.add(new Employee1(123,"Aboli",10000));
	Employee1 k=e.stream().findFirst().orElse(new Employee1(444,"fdgdAboli",67000));
	System.out.println(k.getName());
	if(k.getName().equals("Aboli")) {
		System.out.println("aboli0----");
	}
	Optional<Employee1>o=e.stream().limit(1).findAny();
	System.out.println(o.get());
	
}
}
