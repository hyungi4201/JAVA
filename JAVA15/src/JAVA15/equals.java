package JAVA15;

import java.util.Scanner;

class equals{
	public static void main(String args[]) {
		String a = "a";
		String h;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵� �Է��Ͻÿ� : ");
		
		h = sc.next();
		
		if(a.equals(h) == true) {
			System.out.println("���̵�� ��ġ�մϴ�.");
		}
		else
			System.out.println("���̵�� ��ġ�����ʽ��ϴ�.");
	}
}