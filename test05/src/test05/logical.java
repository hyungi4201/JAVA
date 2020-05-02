package test05;

public class logical {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		System.out.println(x==3&&y==7);//&&(and)는 둘다 맞아야 true가 나오는데 x는 3이 맞지만 y는 7이 아니라서
		System.out.println(x==3||y==7);//||(or)은 둘 중 하나만 맞아도 true가 나오는데 x의 값이 3이 맞아서
		boolean dd = (x==4);//(x==4)가 true인지 false인지를 나타내는 함수이다
		System.out.println(!dd);//(x==4)가 true인지 false인지를 나타내는 dd의 값을 반대로 출력한다
	}
	
}
