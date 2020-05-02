package test07;

import java.util.Scanner;

public class roop2 {
	public static void main(String[] args) {
		int n, i=1;
		System.out.println("구구단중에서 출력하고 싶은 단을 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (i <= 9) {
			System.out.println(n + "*" + i + "=" + n*i);
			i = i+1;
			
		}
	}
}
