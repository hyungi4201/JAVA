package teste06;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r, size;
		
		System.out.print("�������� �Է��Ͻÿ� : ");
		r = input.nextDouble();
		size = r*r*r*4/3;
		
		System.out.println(size);
		
	}
}
