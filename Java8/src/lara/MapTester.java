package lara;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
public static void main(String[] args) {
	Map<Integer, String>m=new HashMap<Integer, String>();
	m.put(120, "sany");
	m.put(450, "asw");
	m.put(67, "gfg");
	m.put(890, "dsfs");
	//m.forEach((k,v)->System.out.printf("%s %s%n",k,v));
	m.put(500, "customer");
	m.put(600, "newperson");
	m.remove(67);
	m.forEach((k,v)->System.out.printf("%s %s%n",k,v));
}
}
