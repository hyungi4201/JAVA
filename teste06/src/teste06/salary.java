package teste06;

import java.util.Scanner;

public class salary {
	public static void main(String[] args) {
		int salary;
		int deposit;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		salary = input.nextInt();
		
		deposit = 10 * 12 * salary;
		System.out.printf("10�� ������ ����� : %d\n",deposit);
		
	}
}
