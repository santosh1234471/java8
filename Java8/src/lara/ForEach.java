package lara;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ForEach {
	private int id;
	private String name;
	private long websites;
	
public ForEach(int id, String name, long websites) {
		super();
		this.id = id;
		this.name = name;
		this.websites = websites;
	}

@Override
public String toString() {
	return "ForEach [id=" + id + ", name=" + name + ", websites=" + websites + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getWebsites() {
	return websites;
}

public void setWebsites(long websites) {
	this.websites = websites;
}

public static void main(String[] args) {
	List<ForEach>l=new ArrayList<ForEach>();
	l.add(new ForEach(1, "santosh", 1234));
	l.add(new ForEach(15, "rsantosh", 21234));
	l.add(new ForEach(13, "vsantosh", 81234));
	l.add(new ForEach(15, "wwrsantosh", 0021234));
//	Map<Integer, String>m=l.stream().collect(Collectors.toMap(ForEach::getId, ForEach::getName));
//	System.out.println(m);
	Map<Integer, String>m3=l.stream().collect(Collectors.toMap(ForEach::getId, ForEach::getName,(oldValue,newValue)->oldValue,LinkedHashMap::new));
	System.out.println(m3);
//	Map<Integer, String>m1=l.stream().collect(Collectors.toMap(x->x.getId(), x->x.getName()));
//	System.out.println(m1);
	
}
}
