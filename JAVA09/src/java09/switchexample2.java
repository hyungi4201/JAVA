package java09;

import java.util.Scanner;

public class switchexample2 {

		public static void main(String args[]) {
			
			Scanner input = new Scanner(System.in);
			int fruit;
			
			System.out.print("������ �Է��Ͻÿ� : ");
			fruit = input.nextInt();
			
			switch (fruit) {
			
			case 1 :
				System.out.println("���");
				break;
			case 2 :
				System.out.println("��");
			case 3 :
				System.out.println("�ٳ���");
				break;
			default :
				System.out.println("����");
				
			}
			
		}
}
