package JAVA25;

import java.util.Scanner;

class Employee{
	String name;
	String adress;
	int money;
	int number;
	
	void setName(String n) {
		name = n;
	}
	void setAdress(String a) {
		adress = a;
	}
	void setMoney(int m) {
		money = m;
	}
	void setNumber(int n) {
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
	
	int getNumber() {
		return number;
	}
}
public class EmployeeTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Employee[] employees = new Employee[3]; 
		
		
		for (int i=0; i < 3; i++) {
			employees[i] = new Employee();
			System.out.println("�����ּҸ� �Է�: ");
			employees[i].setAdress(sc.next());
			System.out.println("���������� �Է�: ");
			employees[i].setMoney(sc.nextInt());
			System.out.println("������ȭ��ȣ�� �Է�: ");
			employees[i].setNumber(sc.nextInt());
			System.out.println("�����̸��� �Է�: ");
			employees[i].setName(sc.next());
			
			
		}
		for ( int i = 0 ; i<3; i++) {
			System.out.println("�ּ�: " + employees[i].getAdress()+ " �̸�: " + employees[i].getName() + " ����: " + employees[i].getMoney() + " ��ȭ��ȣ: " + employees[i].getNumber());
		}
		
	}
}
