package JAVA22;
class Test{
	void sub(int ... v) {
		System.out.println("인수의 개수 : " + v.length);
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}
}
public class VarArgsTest {
	public static void main(String args[]) {
		Test test = new Test();
		test.sub(1, 2, 3, 4, 5, 6, 7, 8, 9);
	}
}
