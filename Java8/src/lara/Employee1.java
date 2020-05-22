package lara;

public class Employee1 {

	private static int id;
	private static String name;
	private static int salary;
	public Employee1(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.name=string;
		this.salary=j;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Employee1.id = id;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Employee1.name = name;
	}
	public static int getSalary() {
		return salary;
	}
	public static void setSalary(int salary) {
		Employee1.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
