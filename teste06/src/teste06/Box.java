package teste06;

import java.util.Scanner;

public class Box {
	public static void main(String[] args) {
		double w, h, area, perimeter;//w, h, area, perimeter �̶�� �Ǽ��� ������ �����
		Scanner input = new Scanner(System.in);//input �̶�� ���ο� ��ĳ�ʸ� �����
		
		System.out.print("���� ���̸� �Է��Ͻÿ� : ");//������ ���̸� �Է��϶�� ������ ����Ѵ�
		w = input.nextDouble();//����ڰ� �Է��� �Ǽ��� w�� �ִ´�
		System.out.print("���� ���̸� �Է��Ͻÿ� : ");//������ ���̸� �Է��϶�� ������ ����Ѵ�
		h = input.nextDouble();//����ڰ� �Է��� �Ǽ��� h�� �ִ´�
		area = w*h;//w�� h�� ���� ���� area�� �ִ´�
		perimeter = 2*(w+h);//w�� h�� ���� �ι��� ���� perimeter�� �ִ´�
		
		System.out.println("�簢���� ���� : " + area + "�簢���� �ѷ� : " + perimeter);//�簢���� ���̴� area�� ���̰� �簢���� �ѷ��� perimeter�� ���̶�°��� ����Ѵ�
		
	}

}
