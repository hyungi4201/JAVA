package test07;

public class unop {
	public static void main(String[] args) {
		int x = 1, y = 1;
		int nextx = ++x, nexty = y++; //nextx�� x�� 1�� ���ϰ� nextx�� ���� �־��ְ� nexty�� nexty�� ���� �־��ְ� y�� 1�� ���Ѵ�
		System.out.println("nextx = " + nextx); // 2
		System.out.println("nexty = " + nexty); // 1
		System.out.println(x); // 1
		System.out.println(y); // 1
		int backx = --x, backy = y--;//backx���� x�� -1�� ���ϰ� backx�� ���� �־��ְ� backy���� y�� ���� �־��ְ� y�� -1�� ���Ѵ�
		System.out.println("backx = " + backx);//1
		System.out.println("backy = " + backy);//2
		System.out.println(x);//1
		System.out.println(y);//1
	}
}
