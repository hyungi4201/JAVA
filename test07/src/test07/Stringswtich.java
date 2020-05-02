package test07;

public class Stringswtich {
	public static void main(String[] args) {
		String month = "2월";//month라는 값에 2월이라는 문자열을 넣는다
		int monthnumber;// 정수형 monthnumber를 만든다
		switch (month) {
		case "1월" ://month의 값이 1월일때 
			monthnumber = 1;//monthnumber의 값을 1로 만든다
			break;//switch함수를 빠져나온다
		case "2월" ://month의 값이 2월일때
			monthnumber = 2;//monthnumber의 값을 2로 만든다
			break;//switch함수를 빠져나온다
		case "3월" ://monthnumber의 값이 3월일때
			monthnumber = 3;//monthnumber의 값을 3으로 만든다
			break;//switch함수를 빠져나온다
		default ://위의 경우들이 아닐때
			monthnumber = 0;//monthnumber의 값을 0으로 만든다
			break;//switch함수를 빠져나온다
		}
		System.out.println(monthnumber);//monthnumber의 값을 출력한다
		
	}
}
