package JAVA17;
class Car{
	private int speed;
	public void setSpeed(int s) {
		speed = s;
		System.out.println("���� ���� ȣ��");
	}
	public void setSpeed(double s) {
		speed = (int)s;
		System.out.println("�Ǽ� ���� ȣ��");
	}
}
public class CarTest2 {
	public static void main (String args[]) {
		Car mycar = new Car();
		mycar.setSpeed(100);
		mycar.setSpeed(79.2);
	}
}
