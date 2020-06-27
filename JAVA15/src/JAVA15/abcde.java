package JAVA15;

import java.util.Scanner;

public class abcde {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String h;
		System.out.print("문자열을 입력하시오");
		
		h = sc.next();
		
		for(int i = h.length() ; i > 0; i-- ) {
			System.out.print(h.charAt(i-1));
		}
	}
}
