package JAVA21;
class Box{
	private int width, length, height;
	boolean empty;
	static int boxes;
	
	int getWidth() {
		return width;
	}
	
	int getLength() {
		return length;
	}
	
	int getHeight() {
		return height;
	}
	
	boolean getEmpty() {
		return empty;
	}
	
	void setWidth(int w) {
		width = w;
	}
	
	void setLength(int l) {
		length = l;
	}
	
	void setHeight(int h) {
		height = h;
	}
	
	void setEmpty(boolean e) {
		empty = e;
	}
	
	public Box() {
		boxes++;
	}
	public Box(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
		boxes++;
	}
	
	static int getBoxes() {
		return boxes;
	}
	}
public class BoxTest {
	public static void main (String args[]) {
		Box b1 = new Box();
		Box b2 = new Box();
		Box b3 = new Box(1, 2, 3);
		
		System.out.println(Box.getBoxes());
	}
}
