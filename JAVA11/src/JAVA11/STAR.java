package JAVA11;

import java.util.Scanner;

public class STAR {
	public static void main (String args[]) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ȧ���� �Է��ϼ��� : ");
		x = sc.nextInt();
		
		for(int i = 1; i <= (x/2 + 1); i++) { // i�� x�� ���밪 �����϶� �Ʒ������� �ݺ��ϰ� i�� 1�� ���Ѵ�
			for(int y = 1; y <= ( i*2 -1 );y++) { // y�� x�� ���밪 �����϶� �Ʒ������� �ݺ��ϰ� y�� 1�� ���Ѵ�
				System.out.print("*"); 
				
			}
			System.out.println("");
			
		}
		
	}
}
