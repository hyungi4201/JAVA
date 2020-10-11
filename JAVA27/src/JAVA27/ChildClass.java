package JAVA27;
class ParentClass{
	int data = 100;
	public void Print() {
		System.out.println("���� Ŭ������ print() �޼ҵ�");
	}
}
public class ChildClass extends ParentClass {
	int data = 200;
	public void Print() {
		super.Print();
		System.out.println("���� Ŭ������ print() �޼ҵ�");
		System.out.println(this.data);
		System.out.println(super.data);
	}
	public static void main(String args[]) {
		ChildClass obj = new ChildClass();
		obj.Print();
	}
}
