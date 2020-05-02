package teste06;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r, size;
		
		System.out.print("반지름을 입력하시오 : ");
		r = input.nextDouble();
		size = r*r*r*4/3;
		
		System.out.println(size);
		
	}
}
