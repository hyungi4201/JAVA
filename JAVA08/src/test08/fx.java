package test08;

import java.util.Scanner;

public class fx {
	public static void main(String args[]) {
		double x,y;
		
		System.out.print("x�� ���� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextDouble();
		
		if ( x <= 0)
			y = x*x*x - 9*x + 2;
		else 
			y = 7*x + 2;
		System.out.println("f(x)�� ���� " + y + "�Դϴ�.");
		
	}
}
