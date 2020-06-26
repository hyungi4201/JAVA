package JAVA14;

public class Numbertest {
	public static void main(String args[]) {
		String si = "123";
		String sd = "3.141592";
		
		int ip = Integer.parseInt(si);
		int i = new Integer(si);
		double dp = Double.parseDouble(sd);
		double d = new Double(sd);
		
		String b = Integer.toBinaryString(ip);
		double cd = Integer.valueOf(si).doubleValue();
		
		System.out.println("ip : " + ip);
		System.out.println("i : " + i);
		System.out.println("dp : " + d);
		System.out.println("d : " + d);
		System.out.println("b : " + b);
		System.out.println("cd : " + cd);
		
		
	}
}
