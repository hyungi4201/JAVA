package teste06;

import java.util.Scanner;

public class salary {
	public static void main(String[] args) {
		int salary;
		int deposit;
		Scanner input = new Scanner(System.in);
		
		System.out.print("월급을 입력하시오 : ");
		salary = input.nextInt();
		
		deposit = 10 * 12 * salary;
		System.out.printf("10년 동안의 저축액 : %d\n",deposit);
		
	}
}
