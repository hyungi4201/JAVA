package java09;

import java.util.Scanner;

public class loopexample2 {

	public static void main(String args[]) {
		int n;//���� n�� �����Ѵ�

		Scanner scan = new Scanner(System.in);//��ĳ�� scan�� �����

		while (true) { //���ѹݺ�
			int i = 1; // ���� i�� 1�� �����
			System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��Ͻÿ� :"); //ū ����ǥ���� ���� ����Ѵ�
			n = scan.nextInt(); // ����ڷκ��� �޾ƿ� ���� n�� ������ �����
			if ( n == 0 ) { //���� n�� ���� 0�� �ȴٸ� �ݺ����� �����Ѵ�.
				break;
			}

			while (i <= 9) {//n�� 0�� �ƴ� �ٸ� ������� i�� 9�����϶����� ������ �ؼ� ����Ѵ�

				System.out.println(n + "*" + i + "=" + n * i);
				i++;//i�� 1�� ���Ѵ�
			}

		}
	}
}
