package test07;

import java.util.Scanner;

public class Daysinmonth {
	public static void main(String[] args) {
		int month, years = 2009, days = 0;
		System.out.println("�ϼ��� �˰����� ���� �Է��Ͻÿ� : ");
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		
		switch (month) {
		case 1 :
		case 3 :	
		case 5 :	
		case 7 :	
		case 8 :	
		case 10 :	
		case 12 :
		days = 31;
		break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
		days = 30;
		break;
		case 2 :
		if (years % 4 == 0) {
			days = 29; //����
			}
		else
			days = 28; //���
			break;
		
		default :
			System.out.println("���� �߸� �ԷµǾ����ϴ�.");
			break;
		}
		System.out.println("���� ������ " + days + "�� �Դϴ�.");
		
		}
	}