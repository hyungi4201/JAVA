package JAVA21;

import java.util.Scanner;

public class ArraryTest {
	public static void main(String args[]) {
		final int STUDENTS = 5 ;
		int total = 0;
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[STUDENTS];
		
		for ( int i = 0;i < STUDENTS; i++) {
			System.out.println("������ �Է��ϼ���");
			scores[i] = scan.nextInt();
		}
		
		for (int i = 0; i < STUDENTS; i ++) {
			total += scores[i];
		}
		System.out.println("��� ������" + total/STUDENTS + "�Դϴ�.");
	}
}
