package JAVA25;

import java.util.Scanner;

public class theater {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][] reserved = new int[5][10];
		
		while(true) {
			System.out.print("좌석을 예약하시겠습니까? (1 또는 0) ");
			int reserve = sc.nextInt();
			
			if (reserve==1) {
				System.out.println("현재의 예약 상태는 다음과 같습니다");
				System.out.println(" 1 2 3 4 5 6 7 8 9 10");
				for(int i = 0;i<reserved.length;i++) {
					System.out.print(i+1 + " ");
					for(int c=0;c < reserved[i].length;c++) {
						System.out.print(reserved[i][c] + " ");
					}
					System.out.println();
				}
				System.out.println("몇번째 좌석을 예약하시겠습니까? ");
				int row = sc.nextInt();
				int column = sc.nextInt();
			
				if (reserved[row-1][column-1] == 0) {
					reserved[row-1][column-1] = 1;
				System.out.println("예약되었습니다.");
				}else {
				System.out.println("이미 예약되어있는 좌석입니다. ");
				}
			}else {
				break;
			}
		}
		
	}
}
