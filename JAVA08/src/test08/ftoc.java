package test08;

import java.util.Scanner;

public class ftoc {
	public static void main(String args[]) {
		double f, c;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ȭ���µ��� �Է��Ͻÿ� : ");
		f = scan.nextDouble();
		c = (f - 32) * 5/9 ;
		
		System.out.println("ȭ���µ�" + f + "�� �����µ� " + c + "�Դϴ�.");
		
	}
	

}
