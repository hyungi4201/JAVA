package JAVA27;
class Shape{
	public Shape(String msg) {
		System.out.println("Shape ������ () " + msg);
	}
}
public class Rectangle extends Shape {
	public Rectangle() {
		super("from Rectangle");
		System.out.println("Rectangle ������()");
	}
}

class shape{
	public shape() {
		System.out.println("shape ������ ()");
	}
}

class rectangle extends shape{
	public rectangle() {
		System.out.println("rectngle ������ ()");
	}
}