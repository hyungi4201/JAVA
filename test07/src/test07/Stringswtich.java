package test07;

public class Stringswtich {
	public static void main(String[] args) {
		String month = "2��";//month��� ���� 2���̶�� ���ڿ��� �ִ´�
		int monthnumber;// ������ monthnumber�� �����
		switch (month) {
		case "1��" ://month�� ���� 1���϶� 
			monthnumber = 1;//monthnumber�� ���� 1�� �����
			break;//switch�Լ��� �������´�
		case "2��" ://month�� ���� 2���϶�
			monthnumber = 2;//monthnumber�� ���� 2�� �����
			break;//switch�Լ��� �������´�
		case "3��" ://monthnumber�� ���� 3���϶�
			monthnumber = 3;//monthnumber�� ���� 3���� �����
			break;//switch�Լ��� �������´�
		default ://���� ������ �ƴҶ�
			monthnumber = 0;//monthnumber�� ���� 0���� �����
			break;//switch�Լ��� �������´�
		}
		System.out.println(monthnumber);//monthnumber�� ���� ����Ѵ�
		
	}
}
