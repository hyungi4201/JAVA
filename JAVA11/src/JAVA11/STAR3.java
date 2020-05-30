package JAVA11;

import java.util.Scanner;

public class STAR3 {
	public static void main(String args[]) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		
		for (int i = 1; i <= (x/2+1); i++) {
			
			for (int y = 1; y <= (i*2-1); y++) {
				System.out.print("*");
				
			}
		}
		
	}
}
