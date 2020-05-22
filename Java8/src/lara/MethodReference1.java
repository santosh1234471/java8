package lara;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference1 {
public static void main(String[] args) {
	List<String>l=Arrays.asList("sany","jklo","qwe");
	l.forEach(new Consumer<String>() {
		public void accept(String str) {
			System.out.println(str);
		}
	});
	l.forEach(s->System.out.println(s));
	l.forEach(System.out::println);
}
}
