package JAVA17;
class Car{
	private int speed;
	public void setSpeed(int s) {
		speed = s;
		System.out.println("정수 버전 호출");
	}
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("실수 버전 호출");
	}
}
public class CarTest2 {
	public static void main (String args[]) {
		Car mycar = new Car();
		mycar.setSpeed(100);
		mycar.setSpeed(79.2);
	}
}
