package test04;

public class arithop {
	public static void main(String[] args) {
		int result;//�����
		double resultdouble;//�Ҽ������
		result = 3+2;
		System.out.println(result);
		result = 3-2;
		System.out.println(result);
		result = 3*2;
		System.out.println(result);
		result = 3/2;
		System.out.println(result);//result�� ������ �������� ����
		resultdouble = 3.0/2.0;
		System.out.println(resultdouble);//double�� �Ǽ��� ��Ÿ�� �� �־ �Ҽ������� ����
		result = 3%2;
		System.out.println(result);
		//result = 3.0/2; result�� �����ε� 3.0�� �Ǽ����¶� ������ ��
		resultdouble = 3.0/2;
		System.out.println(resultdouble);//�Ǽ��ȿ� ������ ���ԵǱ� ������ ���������� �ᵵ �Ǽ������� ���Ե�
		resultdouble = 3/2;
		System.out.println(resultdouble);//�������¸� �������·� �������µ� resultdouble�� �Ǽ������� ���ͼ�
	}
}
