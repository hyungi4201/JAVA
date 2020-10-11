package JAVA27;
class Shape{
	public Shape(String msg) {
		System.out.println("Shape 持失切 () " + msg);
	}
}
public class Rectangle extends Shape {
	public Rectangle() {
		super("from Rectangle");
		System.out.println("Rectangle 持失切()");
	}
}

class shape{
	public shape() {
		System.out.println("shape 持失切 ()");
	}
}

class rectangle extends shape{
	public rectangle() {
		System.out.println("rectngle 持失切 ()");
	}
}