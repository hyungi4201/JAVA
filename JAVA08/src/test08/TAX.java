package test08;

import java.util.Scanner;

public class TAX {
	public static void main(String args[]) {
		int income; 
		int tax;
		System.out.print("���� ǥ�� �ݾ��� �Է��Ͻÿ�");
		
		Scanner input = new Scanner(System.in);
		income = input.nextInt();
		
		if (income <= 10000)
			tax = (int) (0.09 * income);
		else
		{
			if ( income <= 4000 )
				tax = (int) ( 0.18 * income );
			else
			{
				if (income < 8000)
					tax = (int) ( 0.27 * income);
				else 
					tax = (int) (0.36 * income);
				
			}
		}
		System.out.println("�ҵ漼�� " + tax + " �Դϴ�. ");
		
				
	}
}
