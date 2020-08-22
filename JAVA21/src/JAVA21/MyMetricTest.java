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
		System.out.println("������ �Է��ϼ��� : ");
		m = sc.nextInt();
		System.out.println("ų�θ� �Է��ϼ��� : ");
		k = sc.nextInt();
		
		MyMetric mm = new MyMetric(m, k);
		System.out.println(k + "�� mile�� ��ȯ�� ���� " + MyMetric.getKiloToMile());
		System.out.println(m + "�� kilo�� ��ȯ�� ���� " + MyMetric.getMileToKilo());
	}
}
