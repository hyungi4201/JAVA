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
		
		System.out.print("�л��� �̸�, ��ȣ, ���б��� ������� �Է��ϼ���. (ex. ������ 3 1000 )");
		for (int i = 0; i <= stdNum; i++) {
			students[i] = new Student();
		}
	}
	int getStdNum() {
		return stdNum;
	}
	
	void setStdNum(int s) {
		if (s>MAX)
			while(s<=MAX) {
				System.out.println("�ִ� �л����� �ʰ��Ͽ����ϴ�.");
				inputstdNum();
			}
		else
		stdNum = s;
	}
	
}
public class StudentTest {

}
