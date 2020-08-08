package JAVA20;
class Employee2{
	private String name;
	private double salary;
	int age;
	
	public Employee2(String n, double s, int a) {
		name = n;
		salary = s;
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	private double getSalary() {
		return salary;
	}
	
	int getAge() {
		return age;
	}
}
public class EmployeeTest2 {
	public static void main(String args[]) {
		Employee2 e;
		e = new Employee2("ȫ�浿", 3000, 0);
		e.salary = 300;
		e.age = 26;
		int sa = e.getSalary();
		String s = e.getName();
		int a = e.getAge();
		}
	}
