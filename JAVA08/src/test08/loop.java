package test08;

import java.util.Scanner;

public class loop {
	public static void main(String args[]) {
		int n;
		int i = 1;
		System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��Ͻÿ�: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		while (true) {
			System.out.println(n + "*" + i + "=" + n * i);
			i++;

		}
	}
}
