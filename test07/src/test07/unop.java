package test07;

public class unop {
	public static void main(String[] args) {
		int x = 1, y = 1;
		int nextx = ++x, nexty = y++; //nextx는 x에 1을 더하고 nextx에 값을 넣어주고 nexty는 nexty에 값을 넣어주고 y에 1을 더한다
		System.out.println("nextx = " + nextx); // 2
		System.out.println("nexty = " + nexty); // 1
		System.out.println(x); // 1
		System.out.println(y); // 1
		int backx = --x, backy = y--;//backx에는 x에 -1을 더하고 backx에 값을 넣어주고 backy에는 y의 값을 넣어주고 y에 -1을 더한다
		System.out.println("backx = " + backx);//1
		System.out.println("backy = " + backy);//2
		System.out.println(x);//1
		System.out.println(y);//1
	}
}
