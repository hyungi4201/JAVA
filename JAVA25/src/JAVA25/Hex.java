package JAVA25;

import java.util.Scanner;

public class Hex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String Hex;
		String a = "";
		String[] hexa2bin = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		
		System.out.print("16진수 문자열을 입력하시오 : ");
		Hex = sc.next();
		
		for (int i = 0; i < Hex.length();i++) {
			if (48<= (int) Hex.charAt(i) && (int) Hex.charAt(i)<=57) {
				a += hexa2bin[(int) Hex.charAt(i)-48]+ " ";
			}
			if (97<= (int) Hex.charAt(i) && (int) Hex.charAt(i)<=102) {
				a += hexa2bin[(int) Hex.charAt(i)-87] + " ";
			}
		}
		System.out.println(Hex + "에 대한 이진수는 " + a + "입니다");
	}
}