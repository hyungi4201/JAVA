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
		
		System.out.println("���ο� ������ ���� �Է��Ͻÿ� : ");
		r.w = sc.nextInt();
		r.h = sc.nextInt();
		
		System.out.println("�簢���� ���̴� " + r.area() + "�Դϴ�.");
		System.out.println("�簢���� �ѷ��� " + r.perimeter() + "�Դϴ�.");
	}
}