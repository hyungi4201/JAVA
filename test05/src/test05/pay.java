package test05;

import java.util.Scanner;

public class pay {
	public static void main(String[] args) {
		final int RATE = 5000;
		int pay, hours;//pay�� �����̰� hours�� �ð��̴�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ð��� �Է��ϼ��� : ");
		hours = sc.nextInt();
		System.out.println("����� ���� �ð��� " + hours + "�ð� �Դϴ�.");
		
		if (hours>=8)//���� �ð�(hours)�� 8�ð� �̻��̸� �Ʒ� �Լ��� �����Ѵ�
		{
			System.out.println("��ſ��Դ� ���ʽ��� �帮�ڽ��ϴ�.");
			pay = 30*hours*RATE + 500000;
			System.out.println("�׷��� ������ ����� ������ " + pay + "�� �Դϴ�");
		}
		else
		{
			pay = 30*hours*RATE;
			System.out.println("�׷��� ������ ����� ������ " + pay + "�� �Դϴ�");
		}
	}
}
