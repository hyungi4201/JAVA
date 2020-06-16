package JAVA13;

import java.util.Scanner;

public class for9 {
	public static void main(String args[]) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		x = sc.nextInt();
		
		for(int i = 1;i<= (Math.abs(x)/2+1);i++) {
			for(int a=1;a <= (Math.abs(x)-2*i+1)/2;a++) {
				System.out.print(" ");
			}
			for(int b=1;b<=2*i-1;b++) {
				System.out.print("*");
			}
			for(int c =1; c <= (Math.abs(x)-2*i+1)/2; c++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		for(int d = 1; d <= (Math.abs(x)-1)/2;d++) {
			for(int e = 1;e<=d;e++) {
				System.out.print(" ");
			}
			for(int f = 1; f<=Math.abs(x)-2*d;f++){
				System.out.print("*");
			}
			for(int g =1; g <= d;g++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
