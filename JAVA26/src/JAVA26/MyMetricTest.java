package JAVA26;

import java.util.Scanner;

class MyMetric{
	private static double mile;
	private static double kilo;
	
	static void KiloToMile(double k) {
		kilo = k;
		mile = kilo *0.621;
	}
	
	static void MiletoKilo(double m) {
		mile = m;
		kilo = mile*1.609;
	}
	
	double getMile() {
		return mile;
	}
	
	double getKilo() {
		return kilo;
	}
}
public class MyMetricTest {
	public static void main(String args[]) {
		double m, i, k, l;
		
		Scanner sc = new Scanner(System.in);
		MyMetric my = new MyMetric();
		
		System.out.print("마일을 입력하세요 : ");
		MyMetric.MiletoKilo(sc.nextInt());
		m = my.getMile();
		i = my.getKilo();
		
		System.out.print("킬로를 입력하세요 : ");
		MyMetric.KiloToMile(sc.nextInt());
		k = my.getKilo();
		l = my.getMile();
		
		System.out.println(k + "를 mile로 변환한 값은 " + l);
		System.out.println(m + "를 kilo로 변환한 값은 " + i);
	}
}
