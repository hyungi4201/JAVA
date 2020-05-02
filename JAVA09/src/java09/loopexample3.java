package java09;

public class loopexample3 {
	public static void main(String args[]) {
		int i = 10;
		
		do {
			System.out.println("iÀÇ °ª : " + i);
			i++;
			
			if ( i%2 != 0 ) {
				i++;
			}
			} while (i >= 1);
		
	}
}
