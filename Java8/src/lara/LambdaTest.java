package lara;

interface Message{
	String getMessage(String name);
}
public class LambdaTest {
	static void message() {
		Message m=(name)->{return "hello---"+name;};
		System.out.println(m.getMessage("santosh"));
	}
	void compareAnimal() {
		Animal animals=[new Animal(name:"Lion"),new Animal(name:"Tiger"),new Animal(name:"Giraf")];
	}
private Object name(String string) {
		// TODO Auto-generated method stub
		return null;
	}
public static void main(String[] args) {
	new LambdaTest().message();
}
}
