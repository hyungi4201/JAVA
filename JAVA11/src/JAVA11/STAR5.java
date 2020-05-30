package JAVA11;

import java.util.Scanner;

public class STAR5 {
	public static void main(String args[]) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			for (int y = 1; y <= i; y++) {
				System.out.print("*");
			}
			for (int z = 1; z <= x - (i -1); z++) {
				System.out.print("#");
			}
			System.out.println("");
			
		}
	}
}
