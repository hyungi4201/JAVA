package JAVA26;
class Box{
	int height;
	int width;
	int length;
	boolean empty;
	static int boxes;
	
	void setHeight(int h) {
		height = h;
	}
	void setWidth(int w) {
		width = w;
	}
	void setLength(int l) {
		length = l;
	}
	void setEmpty(boolean e) {
		empty = e;
	}
	
	int getHeight() {
		return height;
	}
	int getWidth() {
		return width;
	}
	int getLength() {
		return length;
	}
	boolean getEmpty() {
		return empty;
	}
	
	int getBoxes() {
		return boxes;
	}
	
	Box (int h, int w, int l, boolean e){
		height = h;
		width = w;
		length = l;
		empty = e;
		boxes ++;
	}
	
	Box(){
		boxes++;
	}
	
	
}
public class BoxTest {
	public static void main(String args[]) {
		Box box1 = new Box();
		box1.setHeight(3);
		box1.setWidth(4);
		box1.setLength(5);
		box1.setEmpty(true);
		
		Box box2 = new Box();
		box2.setHeight(6);
		box2.setWidth(2);
		box2.setLength(1);
		box2.setEmpty(false);
		
		System.out.println(box1.getHeight() + " " + box1.getWidth() + " " + box1.getLength() + " " + box1.getEmpty() + " " + box2.getBoxes());
		System.out.println(box2.getHeight() + " " + box2.getWidth() + " " + box2.getLength() + " " + box2.getEmpty() + " " + box2.getBoxes());
		
	}
}
