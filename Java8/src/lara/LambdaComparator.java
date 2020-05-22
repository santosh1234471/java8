package lara;

import java.util.ArrayList;
import java.util.List;

class Developer{
	private String name;
	private int age;
	public Developer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Developer [name=" + name + ", age=" + age + "]";
	}
	
}
public class LambdaComparator {
public static void main(String[] args) {
	List<Developer>f=test();
	//f.sort((Developer d1,Developer d2)->d1.getAge()-d2.getAge());
	f.sort((d1,d2)-> d1.getAge()-d2.getAge());
	f.forEach(d -> System.out.println(d));
	
}
public static List<Developer> test(){
	List<Developer>l=new ArrayList<Developer>();
	l.add(new Developer("sany", 63));
	l.add(new Developer("aman", 10));
	l.add(new Developer("jkl", 345));
	l.add(new Developer("oplm", 78));
	l.add(new Developer("barud", 9));
	return l;
}
}
