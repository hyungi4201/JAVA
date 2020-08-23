package JAVA22;

import java.util.Scanner;

class Employee {
	String name;
	String adress;
	int money;
	String number;

	void setName(String n) {
		name = n;
	}
	
	void setAdress(String a) {
		adress = a;
	}
	
	void setMoney(int m) {
		money = m;
	}
	
	void setNumber(String n) {
		number = n;
	}
	
	String getName() {
		return name;
	}
	
	String getAdress() {
		return adress;
	}
	
	int getMoney() {
		return money;
	}
	
	String getNumber() {
		return number;
	}
}

public class EmployeeTest{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Employee[] employees = new Employee[3];
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		employees[0] = e1;
		employees[1] = e2;
		employees[2] = e3;
		
		for(int i = 0; i < 3; i++) {
			System.out.print("직원 주소를 입력 : ");
			employees[i].setAdress(sc.nextLine());
			System.out.print("직원 월급을 입력 : ");
			employees[i].setMoney(sc.nextInt());
			sc.nextLine();
			System.out.print("직원 전화번호를 입력 : ");
			employees[i].setNumber(sc.nextLine());
			System.out.print("직원 이름을 입력 : ");
			employees[i].setName(sc.nextLine());
		}
		for(int i = 0; i < 3; i++) {
			System.out.println("이름 : " + employees[i].name + " 주소 : " + employees[i].adress + " 월급 : " + employees[i].money + " 전화번호 : " + employees[i].number);
		}
	}
}


