package test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Exampl1 {
public static void main(String[] args) {
	
List<String> checkEmpty = Arrays.asList("Harry", "", "Gary", "Tony", "", "is", "cool");

long s=checkEmpty.stream().filter(str->str.isEmpty()).count();
//long m=l.stream().count;
	 System.out.println(s);
	 
	 List<Integer> checkEmpty1 = Arrays.asList(1,2,3,4,5,67,89);
	 //IntStream i=IntStream.of(checkEmpty1);

	 IntSummaryStatistics s1=new IntSummaryStatistics();
	
	 Iterator<Integer> itr=checkEmpty1.listIterator();
	 while(itr.hasNext()) {
		 s1.accept(itr.next());
	 }
	 System.out.println(s1.toString());
	
			 
}  
}
