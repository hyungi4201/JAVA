package JAVA10;

import java.util.Scanner;

public class averager {
	public static void main(String arg[]) {
		int total = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("������ �Է��Ͻÿ� : ");
			int grade;
			grade = sc.nextInt();
			
			if (grade < 0)
				break;
			else
			{
				total = grade + total;
				count++;
				
			}
		}
		System.out.println("����� ����� " + total/ count + "�Դϴ�." );
		
	}
}
