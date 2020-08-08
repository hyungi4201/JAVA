package JAVA20;
class Employee{
	private String name;
	private double salary;
	
	private static int count = 0;
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
		count++;
	}
	
	protected void finalize() {
		count--;
	}
	
	public static int getCount() {
		return count;
	}
}
public class EmployeeTest {
	public static void main(String args[]) {
		Employee e1, e2, e3;
		
		e1 = new Employee("��ö��", 35000);
		e2 = new Employee("�ּ�ö", 50000);
		e3 = new Employee("��öȣ", 20000);
	
		int n = Employee.getCount();
		System.out.println("���� ������ �� = " + n);
		e2.finalize();
		n = Employee.getCount();
		System.out.println("���� ������ �� = " + n);
	}
}
