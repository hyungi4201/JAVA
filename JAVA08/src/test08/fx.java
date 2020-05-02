package test08;

import java.util.Scanner;

public class fx {
	public static void main(String args[]) {
		double x,y;
		
		System.out.print("x의 값을 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextDouble();
		
		if ( x <= 0)
			y = x*x*x - 9*x + 2;
		else 
			y = 7*x + 2;
		System.out.println("f(x)의 값은 " + y + "입니다.");
		
	}
}
