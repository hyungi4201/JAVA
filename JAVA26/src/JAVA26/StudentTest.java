package JAVA26;

import java.util.Scanner;

class Student{
	public String name;
	public int num, scholarship, id=0;
	public static int count;
	
	Student (String n, int u, int s){
		name = n;
		num = u;
		scholarship = s;
		count ++;
		id = count;
	}
	
	Student (String n, int u){
		name = n;
		num = u;
		count ++;
		id = count;
	}
}

class Manager{
	Scanner sc = new Scanner(System.in);
	
	private int stdNum;
	private Student[] students;
	private int[][] arrangement = new int[3][4];
	final int MAX = 12;
	
	int getStdNum() {
		return stdNum;
	}
	
	void setStdNum(int s) {
		stdNum = s;
		if (stdNum > MAX) {
			System.out.println("최대 학생수를 초과하였습니다.");
			inputStdNum();
		}
	}
	
	void inputStdNum() {
		System.out.print("몇명의 학생을 받으시겠습니까? ");
		setStdNum(sc.nextInt());
		System.out.print(stdNum);
		students = new Student[stdNum];
		String a;
		int b, c;
		
		for (int i = 0; i < stdNum ; i++) {
			System.out.println("학생의 이름, 번호, 장학금을 순서대로 입력하세요. (ex. 민혜미 3 1000) ");
			a = sc.next();
			b = sc.nextInt();
			c = sc.nextInt();
			students[i] = new Student(a, b, c);
		}
	}
	
	void arrangeStudent() {
		for ( int i = 0 ; i < stdNum; i ++) {
			if (1<= students[i].num && students[i].num <=4) {
				arrangement[0][students[i].num - 1] = students[i].id;
			}
			if (5<= students[i].num && students[i].num <=8) {
				arrangement[1][students[i].num - 1] = students[i].id;
			}
			if (9<= students[i].num && students[i].num <=12) {
				arrangement[2][students[i].num - 1] = students[i].id;
			}
		}
		for (int r = 0; r <= 4; r++) {
			for (int c = 0; c<= 3; c++) {
				System.out.print(arrangement[r][c]);
			}
			System.out.println();
		}
	}
}
public class StudentTest {
	public static void main(String args[]) {
		Manager mg = new Manager();
		
		mg.inputStdNum();
		mg.arrangeStudent();
	}
}
