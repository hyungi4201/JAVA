package java09;

import java.util.Scanner;

public class lettergame {

	public static void main (String args[]) {
		int answer = 59;
		int guess ;
		int tries = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("점수를 맞추어보시오 : ");
			guess = scan.nextInt();
			tries++;
			
			if (guess > answer) 
				System.out.println("정답보다 높습니다.");
			if ( guess < answer) 
				System.out.println("정답보다 낮습니다.");
			
		} while (guess != answer);
		
		System.out.println("축하합니다. 정답을 맞췄습니다. 시도 횟수는 " + tries + "번입니다.");
		
	}
}
