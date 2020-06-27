package JAVA15;

import java.util.Scanner;

class equals{
	public static void main(String args[]) {
		String a = "a";
		String h;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력하시오 : ");
		
		h = sc.next();
		
		if(a.equals(h) == true) {
			System.out.println("아이디와 일치합니다.");
		}
		else
			System.out.println("아이디와 일치하지않습니다.");
	}
}