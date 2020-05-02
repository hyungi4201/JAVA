package test07;

import java.util.Scanner;

public class Daysinmonth {
	public static void main(String[] args) {
		int month, years = 2009, days = 0;
		System.out.println("일수를 알고싶은 달을 입력하시오 : ");
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
			days = 29; //윤년
			}
		else
			days = 28; //평년
			break;
		
		default :
			System.out.println("월이 잘못 입력되었습니다.");
			break;
		}
		System.out.println("월의 날수는 " + days + "일 입니다.");
		
		}
	}
