package JAVA15;

import java.util.Scanner;

class Rectangle{
	int w, h;
	
	int area() {
		return w*h;
	}
	
	int perimeter() {
		return ( w + h )*2;
	}
}

class RectangleTest{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		
		System.out.println("가로와 세로의 값을 입력하시오 : ");
		r.w = sc.nextInt();
		r.h = sc.nextInt();
		
		System.out.println("사각형의 넓이는 " + r.area() + "입니다.");
		System.out.println("사각형의 둘레는 " + r.perimeter() + "입니다.");
	}
}