package test08;

import java.util.Scanner;

public class lattergame {
	public static void main(String args[]) {
		int answer = 48;
		int guess;
		int tries = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("추측하여 보시오");
			guess = scan.nextInt();
			tries++;
			
			if (guess > answer)
				System.out.println("추측한 값이 답보다 높습니다.");
			if (guess < answer )
				System.out.println("추측한 값이 답보다 낮습니다.");
			
		} while ( guess != answer);
		
		System.out.println("축하합니다! 지금까지 시도 횟수는 " + tries + "번 입니다!");
		
	}
}
