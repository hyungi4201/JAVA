package JAVA13;

import java.util.Scanner;

public class for8 {
	public static void main(String args[]) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		x = sc.nextInt();
		
		for(int i = 1; i <= (x-1)/2;i++) {
			for(int y = 1;y<= i-1 ;y++) {
				System.out.print("#");
			}
			for(int z = 1; z <= x-2*i;z++) {
				System.out.print("*");
			}
			for(int p = 1;p<= i-1;p++) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}
}
