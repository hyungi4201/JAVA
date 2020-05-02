package test08;

import java.util.Scanner;

public class asdf {
	public static void main (String args[]) {
		int x, y, q, r;
		
		System.out.print("정수를 입력하시오 ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		
		System.out.print("정수를 입력하시오 ");
		y = scan.nextInt();
		
		if (x > y )
		{
			q = x/y;
			r = x%y;
			System.out.println(x + "를 " + y + "로 나눈 몫은 " + q + "이고 나머지는 " + r + "입니다.");
			
		}
		else 
		{ 
			q = y/x;
			r = y%x;
			System.out.println(y + "를 " + x + "로 나눈 몫은 " + q + "이고 나머지는 " + r + "입니다.");
		}
		
	}
}
