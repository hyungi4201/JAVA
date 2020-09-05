package JAVA23;

import java.util.Scanner;

public class Hex {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		String Hex;
		String[] hex2bin = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		System.out.println("16진수 문자열을 입력하시오 : ");
		Hex = sc.next();
		System.out.print(Hex + " 에 대한 이진수는 ");
		for ( int i = 0 ; i < Hex.length(); i++) {
			if ((int)Hex.charAt(i)>=97&&(int)Hex.charAt(i)<=102) {
				System.out.print(hex2bin[(Hex.charAt(i)-87)]+" ");
			}
			else
				if ((int)Hex.charAt(i)>=48&&(int)Hex.charAt(i)<=57) {
					System.out.print(hex2bin[(Hex.charAt(i)-48)] + " ");
				}
		}
		System.out.print(" 입니다");
		/*String h ="", a = "";
		
		for(int i = 0; i < Hex.length(); i++) {
			switch ((int) Hex.charAt(i)) {
			case 48:
				a = "0000";
				break;
			case 49:
				a = "0001";
				break;
			case 50:
				a = "0010";
				break;
			case 51:
				a = "0011";
				break;
			case 52 : 
				a = "0100";
				break;
			case 53 :
				a = "0101";
				break;
			case 54:
				a = "0110";
				break;
			case 55:
				a = "0111";
				break;
			case 56 :
				a = "1000";
				break;
			case 57 :
				a = "1001";
				break;
			case 97 :
				a = "1010";
				break;
			case 98 :
				a = "1011";
				break;
			case 99 :
				a = "1100";
				break;
			case 100 :
				a = "1101";
				break;
			case 101 :
				a = "1110";
				break;
			case 102 :
				a = "1111";
				break;
			}
			h = h +" " + a;
		}*/
		
	}
}
	
