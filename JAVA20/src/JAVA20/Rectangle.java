package JAVA20;

public class Rectangle {
	static final double x = 10;
	static final double y = 8;
	
	private double width;
	private double length;
	private static int count;
	
	public double getArea() {
		return width * length;
	}
	
	public static int getCount() {
		return count;
	}
	
	public Rectangle() {
		width = x;
		length = y;
	}
	
	public Rectangle(double w, double l) {
		width = w;
		length = l;
	}
}
