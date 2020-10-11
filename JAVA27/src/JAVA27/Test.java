package JAVA27;
class Car{
	int speed;
	int gear;
	public String color;
	
	public void SpeedUp(int increment) {
		speed += increment;
	}
	
	public void SpeedDown(int decrement) {
		speed -= decrement;
	}
}
class SportsCar extends Car {
	boolean turbo;
	
	public void setTurbo(boolean newValue) {
		turbo = newValue;
	}
}
public class Test{
	public static void main(String args[]) {
		SportsCar c = new SportsCar();
		Car ca = new Car();
		c.color = "red";
		c.SpeedUp(100);
		c.SpeedDown(30);
		c.setTurbo(true);
		ca.setTurbo(true);
	}
}