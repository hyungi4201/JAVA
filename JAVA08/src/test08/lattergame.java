package test08;

import java.util.Scanner;

public class lattergame {
	public static void main(String args[]) {
		int answer = 48;
		int guess;
		int tries = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("�����Ͽ� ���ÿ�");
			guess = scan.nextInt();
			tries++;
			
			if (guess > answer)
				System.out.println("������ ���� �亸�� �����ϴ�.");
			if (guess < answer )
				System.out.println("������ ���� �亸�� �����ϴ�.");
			
		} while ( guess != answer);
		
		System.out.println("�����մϴ�! ���ݱ��� �õ� Ƚ���� " + tries + "�� �Դϴ�!");
		
	}
}
