package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FiZZBuzz {
public static void main(String[] args) {
	//List<Integer>l=Arrays.asList(arg0)
			IntStream ist=IntStream.range(1, 20);
			ist.mapToObj(i->i%3==0 ?(i%5==0? "FizzBuzz":"Buzz"):( i%5==0? "Buzz":i)).forEach(System.out::println);
}
}
