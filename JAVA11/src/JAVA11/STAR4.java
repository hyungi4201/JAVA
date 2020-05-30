package JAVA11;

import java.util.Scanner;

public class STAR4 {
	public static void main(String args[]) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		
		for (int i = 1; i <= x ; i++) {
			for (int y = 1; y <= x - (i - 1); y++) {
				System.out.print("#");
				
			}
			System.out.println("");
		}
	}

}
