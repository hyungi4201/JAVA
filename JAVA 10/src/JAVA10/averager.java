package JAVA10;

import java.util.Scanner;

public class averager {
	public static void main(String arg[]) {
		int total = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("정수를 입력하시오 : ");
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
		System.out.println("당신의 평균은 " + total/ count + "입니다." );
		
	}
}
