package JAVA23;

import java.util.Scanner;

class Student{
	public String name;
	public int num;
	public int scholarship;
	public int id;
	
	public static int count;
	
	Student(String name, int num, int scholarship){
		count++;
		id = count;
	}
	
	Student(String name, int num){
		count++;
		id = count;
	}
	
}

class Manager{
	Scanner sc = new Scanner(System.in);
	
	private int stdNum;
	private Student[] students;
	private int[][] arrangement = new int[3][4];
	final int MAX = 12;
	
	void inputstdNum() {
		int t;
		System.out.print("����� �л��� �����ðڽ��ϱ�? : ");
		t = sc.nextInt();
		setStdNum(t);
		
		
			students = new Student[stdNum];
		for (int i = 0; i < stdNum; i++) {
			System.out.print("�л��� �̸�, ��ȣ, ���б��� ������� �Է��ϼ���. (ex. ������ 3 1000 )");
			String s;
			int n, sch;
			
			s = sc.next();
			n = sc.nextInt();
			sch = sc.nextInt();
			students[i] = new Student(s, n, sch);
		}
	}
	int getStdNum() {
		return stdNum;
	}
	
	void setStdNum(int s) {
		if (s>MAX) {
			while(s>MAX) {
				System.out.println("�ִ� �л����� �ʰ��Ͽ����ϴ�.");
				System.out.print("����� �л��� �����ðڽ��ϱ�? : ");
				s = sc.nextInt();
			}
			stdNum =s;
		}
		else
		stdNum = s;
	}
	
	void arrangeStudent() {
		for (int i = 0 ; i<=stdNum ; i++) {
			if (students[i].num<=4) 
				arrangement[0][i-1] = students[i].count;
			if (students[i].num<=8&&students[i].num>=5)
				arrangement[1][i-5] = students[i].count;
			if (students[i].num<=12&&students[i].num>=9)
				arrangement[2][i-9] = students[i].count;
		}
	}
}
		
public class StudentTest {
	public static void main(String args[]) {
		Manager mg = new Manager();
		mg.inputstdNum();
	}
}
