package JAVA11;

import java.util.Scanner;

public class STAR {
	public static void main (String args[]) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("홀수를 입력하세요 : ");
		x = sc.nextInt();
		
		for(int i = 1; i <= (x/2 + 1); i++) { // i가 x의 절대값 이하일때 아래내용을 반복하고 i에 1을 더한다
			for(int y = 1; y <= ( i*2 -1 );y++) { // y가 x의 절대값 이하일때 아래내용을 반복하고 y에 1을 더한다
				System.out.print("*"); 
				
			}
			System.out.println("");
			
		}
		
	}
}
