package teste06;

import java.util.Scanner;

public class Box {
	public static void main(String[] args) {
		double w, h, area, perimeter;//w, h, area, perimeter 이라는 실수형 변수를 만든다
		Scanner input = new Scanner(System.in);//input 이라는 새로운 스캐너를 만든다
		
		System.out.print("가로 길이를 입력하시오 : ");//가로의 길이를 입력하라는 문구를 출력한다
		w = input.nextDouble();//사용자가 입력한 실수를 w에 넣는다
		System.out.print("세로 길이를 입력하시오 : ");//세로의 길이를 입력하라는 문구를 출력한다
		h = input.nextDouble();//사용자가 입력한 실수를 h에 넣는다
		area = w*h;//w와 h를 곱한 값을 area에 넣는다
		perimeter = 2*(w+h);//w와 h의 합의 두배의 값을 perimeter에 넣는다
		
		System.out.println("사각형의 넓이 : " + area + "사각형의 둘레 : " + perimeter);//사각형의 넓이는 area의 값이고 사각형의 둘레는 perimeter의 값이라는것을 출력한다
		
	}

}
