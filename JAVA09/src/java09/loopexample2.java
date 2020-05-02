package java09;

import java.util.Scanner;

public class loopexample2 {

	public static void main(String args[]) {
		int n;//정수 n을 생성한다

		Scanner scan = new Scanner(System.in);//스캐너 scan을 만든다

		while (true) { //무한반복
			int i = 1; // 정수 i를 1로 만든다
			System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오 :"); //큰 따옴표안의 말을 출력한다
			n = scan.nextInt(); // 사용자로부터 받아온 값을 n의 값으로 만든다
			if ( n == 0 ) { //만약 n의 값이 0이 된다면 반복문을 종료한다.
				break;
			}

			while (i <= 9) {//n이 0이 아닌 다른 정수라면 i가 9이하일때까지 곱셉을 해서 출력한다

				System.out.println(n + "*" + i + "=" + n * i);
				i++;//i에 1을 더한다
			}

		}
	}
}
