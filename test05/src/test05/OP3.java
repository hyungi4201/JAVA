package test05;

public class OP3 {//삼항연산자
	public static void main(String[] args) {
		int x = 9;
		int y = 14;
		int max = (x>y)? x : y;//x가 y보다 크면 max의 값이 x가 되고 x가 y이하이면 max의 값이 y가 된다
		System.out.println(max);
		
	}
}
