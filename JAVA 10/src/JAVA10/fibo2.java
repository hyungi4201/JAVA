package JAVA10;

import java.util.Scanner;

public class fibo2 {
	public static void main (String args[]) {
		int x = 0, y = 1, z, a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇개까지 출력하시겠습니까? : " );
		a = sc.nextInt();
		
		System.out.println(x);
		System.out.println(y);
		
		for ( int i = 1 ; i <= a - 2 ; i ++) {
			
			z = y + x;
			System.out.println(z);
			
			x = y;
			y = z;
			
		}
		
	}
}
