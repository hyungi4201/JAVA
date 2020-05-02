package test04;

public class ariacast {
	public static void main(String[] args) {
		double radius;//원의 반지름
		double area;//원의 넓이
		final double PI = 3.141592;
		radius = 5;
		area = PI*radius*radius;
		System.out.println("원의 면적은 " + area);
		double k;
		k = PI*2*radius;
		System.out.println("원의 둘레는 " + k);
		
	}
}
