package JAVA14;
class Car{
	String color;
	int speed;
	int gear;
	void print() {
		System.out.println("(" + color + "," + speed + "," + gear + ")");
	}
}
class cartest {
	public static void main (String args[]) {
		Car mycar = new Car();
				mycar.color = "red";
				mycar.speed = 0;
				mycar.gear = 1;
				mycar.print();
		
		Car mycar2 = new Car();
			mycar2.color = "black";
			mycar2.speed = 3;
			mycar2.gear = 2;
			mycar2.print();
			
	}
}
