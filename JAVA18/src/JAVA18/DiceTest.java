package JAVA18;
class Dice{
	private int face;
	
	public void setFace() {
		roll();
	}
	
	public int getFace() {
		return face;
	}
	
	void roll() {
		face = (int)(Math.random() * 6)+1;
	}
}
public class DiceTest {
	public static void main(String args[]) {
		Dice di = new Dice();
		di.setFace();
		System.out.println("현재 나온 주사위 면은? " + di.getFace());
	}
}
