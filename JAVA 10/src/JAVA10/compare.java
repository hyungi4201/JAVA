package JAVA10;

import java.util.Scanner;

public class compare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int x,y,z;
		
		System.out.print("������ �Է��ϼ���");
		x = sc.nextInt();
		
		System.out.print("������ �Է��ϼ���");
		y = sc.nextInt();
		
		System.out.print("������ �Է��ϼ���");
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
