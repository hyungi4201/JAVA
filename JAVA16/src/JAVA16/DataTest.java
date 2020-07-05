package JAVA16;

import java.util.Scanner;

class Data{
	int year, month, day;
	
	void print1() {
		System.out.println( year + "." + month + "." + day);
	}
	
	void print2() {
		String m = "";
		switch(month){
		case 1:
			m = "January";
			break;
		case 2:
			m = "Febuary";
			break;
		case 3:
			m = "March";
			break;
		case 4:
			m = "April";
			break;
		case 5:
			m = "May";
			break;
		case 6:
			m = "June";
			break;
		case 7:
			m = "July";
			break;
		case 8:
			m = "Agust";
			break;
		case 9:
			m = "September";
			break;
		case 10:
			m = "October";
			break;
		case 11:
			m = "November";
			break;
		case 12:
			m = "December";
			break;
		}
		System.out.println( m + day + "," + year);
	}
}
public class DataTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도, 월, 일을 입력하시오 : ");
		Data data = new Data();
		data.year = sc.nextInt();
		data.month = sc.nextInt();
		data.day = sc.nextInt();
		
		data.print1();
		data.print2();
	}
}
