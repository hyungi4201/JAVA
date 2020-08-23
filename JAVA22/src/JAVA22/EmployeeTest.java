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
			System.out.print("���� �ּҸ� �Է� : ");
			employees[i].setAdress(sc.nextLine());
			System.out.print("���� ������ �Է� : ");
			employees[i].setMoney(sc.nextInt());
			sc.nextLine();
			System.out.print("���� ��ȭ��ȣ�� �Է� : ");
			employees[i].setNumber(sc.nextLine());
			System.out.print("���� �̸��� �Է� : ");
			employees[i].setName(sc.nextLine());
		}
		for(int i = 0; i < 3; i++) {
			System.out.println("�̸� : " + employees[i].name + " �ּ� : " + employees[i].adress + " ���� : " + employees[i].money + " ��ȭ��ȣ : " + employees[i].number);
		}
	}
}


