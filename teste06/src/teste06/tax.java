package teste06;

import java.util.Scanner;

public class tax {
	public static void main(String[] args) {
		int income, tax;//income 과세표준, tax 세금
		System.out.println("과세표준 금액을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		income = sc.nextInt();
		
		if (income <=1000)
			tax = (int)(income*0.09);
		else if (income <=4000)
			tax = (int)(income*0.18);
		else if (income <= 8000)
			tax = (int)(income*0.27);
		else
			tax = (int)(income*0.36);
		
		System.out.println("소득세는 " + tax + "원입니다");
		
		 
	}
}
