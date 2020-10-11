package JAVA27;
class ParentClass{
	int data = 100;
	public void Print() {
		System.out.println("수퍼 클래스의 print() 메소드");
	}
}
public class ChildClass extends ParentClass {
	int data = 200;
	public void Print() {
		super.Print();
		System.out.println("서브 클래스의 print() 메소드");
		System.out.println(this.data);
		System.out.println(super.data);
	}
	public static void main(String args[]) {
		ChildClass obj = new ChildClass();
		obj.Print();
	}
}
