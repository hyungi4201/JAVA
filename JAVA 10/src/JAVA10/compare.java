package JAVA10;

import java.util.Scanner;

public class compare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int x,y,z;
		
		System.out.print("정수를 입력하세요");
		x = sc.nextInt();
		
		System.out.print("정수를 입력하세요");
		y = sc.nextInt();
		
		System.out.print("정수를 입력하세요");
		z = sc.nextInt();
		
		if (x <= y)
		{
			if (y <= z)
				System.out.println(x + "" + y + "" + z);
			else
				if (x <= z)
				System.out.println(x + "" + z + "" + y);
				else
				System.out.println(z + "" + x + "" + y);
		}
		else
		{
			if (x <= z)
				System.out.println(y + "" + x + "" + z);
			else
				if ( y <= z )
				System.out.println(y + "" + z + "" + x);
				else 
				System.out.println(z + "" + y + "" + x);
			
			
		}
	}
}
