package java09;

import java.util.Scanner;

public class switchexample2 {

		public static void main(String args[]) {
			
			Scanner input = new Scanner(System.in);
			int fruit;
			
			System.out.print("점수를 입력하시오 : ");
			fruit = input.nextInt();
			
			switch (fruit) {
			
			case 1 :
				System.out.println("사과");
				break;
			case 2 :
				System.out.println("배");
			case 3 :
				System.out.println("바나나");
				break;
			default :
				System.out.println("과일");
				
			}
			
		}
}
