package JAVA19;
class Car{
	private String color;
	private int gear;
	private int speed;
	private int id;
	
	private static int numberOfCars = 0;
	
	public Car(String c, int s, int g) {
		color = c;
		speed = s;
		gear = g;
		id = ++numberOfCars;
	}
	public static int getnumberOfCars() {
		return numberOfCars;
	}
	
}
public class CarTest3 {
	public static void main(String args[]) {
		Car c1= new Car("blue", 100, 1);
		Car c2 = new Car("white", 100, 1);
		int n = Car.getnumberOfCars();
		System.out.println("지금까지 생성된 자동차 수" + n);
	}
}
