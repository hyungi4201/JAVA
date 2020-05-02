package teste06;

import java.util.Scanner;

public class circlearea {
	public static void main(String[] args) {
		double r, area;//실수 r과 area를 만든다
		Scanner sc = new Scanner(System.in);//새로운 스캐너 sc를 만든다
		
		System.out.println("반지름을 입력하세요 : ");//사용자에게 숫자를 입력하라고 말한다
		r = sc.nextDouble();//사용자가 입력한 숫자를 r에 넣는다
		
		area = 3.14*r*r;//반지름 제곱 곱하기 3.14의 값을 area 에 넣는다
		System.out.println("원의 면적은 : " + area + "입니다");//사용자에게 area의 값을 출력해준다
		
		
	}
}
