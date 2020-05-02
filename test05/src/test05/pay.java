package test05;

import java.util.Scanner;

public class pay {
	public static void main(String[] args) {
		final int RATE = 5000;
		int pay, hours;//pay는 월급이고 hours는 시간이다
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시간을 입력하세요 : ");
		hours = sc.nextInt();
		System.out.println("당신이 일한 시간은 " + hours + "시간 입니다.");
		
		if (hours>=8)//일한 시간(hours)가 8시간 이상이면 아래 함수를 실행한다
		{
			System.out.println("당신에게는 보너스를 드리겠습니다.");
			pay = 30*hours*RATE + 500000;
			System.out.println("그렇기 때문에 당신의 월급은 " + pay + "원 입니다");
		}
		else
		{
			pay = 30*hours*RATE;
			System.out.println("그렇기 때문에 당신의 월급은 " + pay + "원 입니다");
		}
	}
}
