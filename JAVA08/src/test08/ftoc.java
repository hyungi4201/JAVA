package test08;

import java.util.Scanner;

public class ftoc {
	public static void main(String args[]) {
		double f, c;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("화씨온도를 입력하시오 : ");
		f = scan.nextDouble();
		c = (f - 32) * 5/9 ;
		
		System.out.println("화씨온도" + f + "는 섭씨온도 " + c + "입니다.");
		
	}
	

}
