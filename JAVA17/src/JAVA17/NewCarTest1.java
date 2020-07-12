package JAVA17;

class NewCar {
	private String color;
	private int speed;
	private int gear;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	public int getSpeed() {return speed;}
	public void setSpeed(int s) {speed = s;}
	public int getGear() {return gear;}
	public void setGear(int g) { gear = g;}
}

public class NewCarTest1{
	public static void main(String args[]) {
		
		NewCar mycar = new NewCar();
		
		mycar.setColor("red");
		mycar.setSpeed(100);
		mycar.setGear(1);
		
		System.out.println("현재 자동차의 색깔은 : " + mycar.getColor());
		System.out.println("현재 자동차의 속도는 :" + mycar.getSpeed());
		System.out.println("현재 자동차의 기어는 : " + mycar.getGear());
		
	}
	
}

