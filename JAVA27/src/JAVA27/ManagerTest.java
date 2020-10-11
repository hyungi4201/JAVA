package JAVA27;
class Employee{
	public String name;
	String adress;
	protected int salary;
	private int RRN;
	
	public String toString() {
		return name + ", " + adress + ", " + RRN + ", " + salary;
	}
}

class Manager extends Employee{
	private int bonus;
	
	public void printSalary() {
		System.out.println(name + "(" + adress + "):" + (salary + bonus) );
	}
	
	public void printRRN() {
		System.out.print(RRN);
	}
}
public class ManagerTest {
	public static void main(String args[]) {
		Manager m = new Manager();
		m.printRRN();
	}
}
