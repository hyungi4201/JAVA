package java09;

import java.util.Scanner;

public class lettergame {

	public static void main (String args[]) {
		int answer = 59;
		int guess ;
		int tries = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("������ ���߾�ÿ� : ");
			guess = scan.nextInt();
			tries++;
			
			if (guess > answer) 
				System.out.println("���亸�� �����ϴ�.");
			if ( guess < answer) 
				System.out.println("���亸�� �����ϴ�.");
			
		} while (guess != answer);
		
		System.out.println("�����մϴ�. ������ ������ϴ�. �õ� Ƚ���� " + tries + "���Դϴ�.");
		
	}
}
