package JAVA24;

import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String args[]) {
		final int STUDENTS = 5;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[STUDENTS];
		
		for (int i = 0; i < STUDENTS; i++) {
			System.out.print("������ �Է��Ͻÿ� : " );
			scores[i] = sc.nextInt();
		}
		
		for (int i = 0;i<STUDENTS;i++) 
			total += scores[i];
		System.out.println("��� ������ " + total / STUDENTS + "�Դϴ�." );
	}
}