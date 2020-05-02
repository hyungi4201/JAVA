package teste06;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		int k, h,l;
		System.out.println("숫자 두개를 입력하세요 : " );
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();//다음에 오는 정수의 값을 k에 넣는다
		h = sc.nextInt();//다음에 오는 정수의 값을 h에 넣는다
		l = k + h;
		System.out.println("값은 " + l + "입니다");
		
	}
}
