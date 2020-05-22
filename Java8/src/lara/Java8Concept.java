package lara;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Concept {
public static void main(String[] args) {
	List<String>h=createList().stream().filter(s->s.startsWith("ja")).collect(Collectors.toList());
	System.out.println(h);
	String m=createList().stream().collect(Collectors.joining("-"));
	System.out.println(m);
	
	String g="E:\\nodea\\Java8\\src\\lara\\MyTest.txt";
	try {
		BufferedReader br=new BufferedReader(new FileReader(new File(g)));
		String longestline=br.lines().reduce((x, y)->{
			if(x.length()>y.length()) 
				return x;
			return y;
		}).get();
		System.out.println("longest line-- \n"+longestline);
	}catch(IOException e) {
		System.out.println(e);
	}
	
}
private static List<String> createList() {
	return Arrays.asList("Oliver","Harry","jacob","charlie");
}
}
