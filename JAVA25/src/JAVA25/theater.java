package JAVA25;

import java.util.Scanner;

public class theater {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][] reserved = new int[5][10];
		
		while(true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�? (1 �Ǵ� 0) ");
			int reserve = sc.nextInt();
			
			if (reserve==1) {
				System.out.println("������ ���� ���´� ������ �����ϴ�");
				System.out.println(" 1 2 3 4 5 6 7 8 9 10");
				for(int i = 0;i<reserved.length;i++) {
					System.out.print(i+1 + " ");
					for(int c=0;c < reserved[i].length;c++) {
						System.out.print(reserved[i][c] + " ");
					}
					System.out.println();
				}
				System.out.println("���° �¼��� �����Ͻðڽ��ϱ�? ");
				int row = sc.nextInt();
				int column = sc.nextInt();
			
				if (reserved[row-1][column-1] == 0) {
					reserved[row-1][column-1] = 1;
				System.out.println("����Ǿ����ϴ�.");
				}else {
				System.out.println("�̹� ����Ǿ��ִ� �¼��Դϴ�. ");
				}
			}else {
				break;
			}
		}
		
	}
}
