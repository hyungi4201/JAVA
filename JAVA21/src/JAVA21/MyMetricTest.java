package JAVA21;

import java.util.Scanner;

class MyMetric{
	private	static double mile;
	private static double kilo;
	
	static double getKiloToMile() {
		return kilo * 0.621;
	}
	
	static double getMileToKilo() {
		return mile * 1.609;
	}
	
	public MyMetric(double m, double k) {
		mile = m;
		kilo = k;
	}
}
public class MyMetricTest {
	public static void main(String args[]) {
		double m, k;
		Scanner sc = new Scanner(System.in);
		System.out.println("마일을 입력하세요 : ");
		m = sc.nextInt();
		System.out.println("킬로를 입력하세요 : ");
		k = sc.nextInt();
		
		MyMetric mm = new MyMetric(m, k);
		System.out.println(k + "를 mile로 변환한 값은 " + MyMetric.getKiloToMile());
		System.out.println(m + "를 kilo로 변환한 값은 " + MyMetric.getMileToKilo());
	}
}
