package test04;

public class arithop {
	public static void main(String[] args) {
		int result;//결과값
		double resultdouble;//소수결과값
		result = 3+2;
		System.out.println(result);
		result = 3-2;
		System.out.println(result);
		result = 3*2;
		System.out.println(result);
		result = 3/2;
		System.out.println(result);//result가 정수라서 정수값만 나옴
		resultdouble = 3.0/2.0;
		System.out.println(resultdouble);//double은 실수를 나타낼 수 있어서 소수값까지 나옴
		result = 3%2;
		System.out.println(result);
		//result = 3.0/2; result는 정수인데 3.0은 실수형태라서 오류가 뜸
		resultdouble = 3.0/2;
		System.out.println(resultdouble);//실수안에 정수가 포함되기 때문에 정수값으로 써도 실수값으로 포함됨
		resultdouble = 3/2;
		System.out.println(resultdouble);//정수형태를 정수형태로 나누었는데 resultdouble은 실수형으로 나와서
	}
}
