package test05;

public class logical {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		System.out.println(x==3&&y==7);//&&(and)�� �Ѵ� �¾ƾ� true�� �����µ� x�� 3�� ������ y�� 7�� �ƴ϶�
		System.out.println(x==3||y==7);//||(or)�� �� �� �ϳ��� �¾Ƶ� true�� �����µ� x�� ���� 3�� �¾Ƽ�
		boolean dd = (x==4);//(x==4)�� true���� false������ ��Ÿ���� �Լ��̴�
		System.out.println(!dd);//(x==4)�� true���� false������ ��Ÿ���� dd�� ���� �ݴ�� ����Ѵ�
	}
	
}
