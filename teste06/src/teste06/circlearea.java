package teste06;

import java.util.Scanner;

public class circlearea {
	public static void main(String[] args) {
		double r, area;//�Ǽ� r�� area�� �����
		Scanner sc = new Scanner(System.in);//���ο� ��ĳ�� sc�� �����
		
		System.out.println("�������� �Է��ϼ��� : ");//����ڿ��� ���ڸ� �Է��϶�� ���Ѵ�
		r = sc.nextDouble();//����ڰ� �Է��� ���ڸ� r�� �ִ´�
		
		area = 3.14*r*r;//������ ���� ���ϱ� 3.14�� ���� area �� �ִ´�
		System.out.println("���� ������ : " + area + "�Դϴ�");//����ڿ��� area�� ���� ������ش�
		
		
	}
}
