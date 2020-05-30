package JAVA11;

import java.util.Scanner;

public class star2 {
	public static void main(String args[]) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			for (int y = 1; y <= i; y++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
	}
}
