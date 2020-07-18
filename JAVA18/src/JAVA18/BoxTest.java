package JAVA18;
class Box{
	private int width, length, height;
	
	public void setwidth(int w) {
		width = w;
	}
	public void setlength(int l) {
		length = l;
	}
	public void setheight(int h) {
		height = h;
	}
	
	
	public int getwidth() {
		return width;
	}
	
	public int getlength() {
		return length;
	}
	
	public int getheight() {
		return height;
	}
	
	
	public int getVolume() {
		return (width * length * height);
	}
	
	public void setBox(int a, int b) {
		width = a;
		length = b;
	}
	
	public void setBox(int a, int b, int c) {
		width = a;
		length = b;
		height = c;
	}
}
public class BoxTest {
	public static void main(String args[]) {
		Box box1 = new Box();
		
		box1.setBox(100, 100, 100);
		box1.getVolume();
		
		Box box2 = new Box();
		
		box2.setBox(200, 200, 200);
		box2.setBox(150, 150);
		
		System.out.println("box1의 가로 : " + box1.getwidth() + "box1의 세로 : " + box1.getlength() + "box1의 높이 : " + box1.getheight() + "box2의 가로 : " + box2.getwidth() + "box2의 세로 : " + box2.getlength() + "box2의 높이 : " + box2.getheight());
	}
}
