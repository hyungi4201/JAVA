package test08;

import java.util.Scanner;

public class asdf {
	public static void main (String args[]) {
		int x, y, q, r;
		
		System.out.print("������ �Է��Ͻÿ� ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		
		System.out.print("������ �Է��Ͻÿ� ");
		y = scan.nextInt();
		
		if (x > y )
		{
			q = x/y;
			r = x%y;
			System.out.println(x + "�� " + y + "�� ���� ���� " + q + "�̰� �������� " + r + "�Դϴ�.");
			
		}
		else 
		{ 
			q = y/x;
			r = y%x;
			System.out.println(y + "�� " + x + "�� ���� ���� " + q + "�̰� �������� " + r + "�Դϴ�.");
		}
		
	}
}
