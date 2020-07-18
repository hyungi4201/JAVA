package JAVA18;

class Employee{
	private String name, number;
	private int money;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setNumber(String u) {
		number = u;
	}
	public String getNumber() {
		return number;
	}
	
	public void setMoney(int m) {
		money = m;
	}
	public int getMoney() {
		return money;
	}
}
public class EmployeeTest {
	public static void main(String args[]) {
		Employee em = new Employee();
		
		em.setName("직원");
		em.setNumber("010-123-4567");
		em.setMoney(1000000);
		
		System.out.println("직원의 이름은 " + em.getName());
		System.out.println("직원의 전화번호는 " + em.getNumber());
		System.out.println("직원의 연봉은 " + em.getMoney());
		
	}
}
