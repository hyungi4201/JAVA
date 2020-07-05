package JAVA16;

class MyString{
	String a = "abcdefg";
	String b = "";
	
	String concat() {
		a.concat("");
		return a;
	}
	
	String toUpperCase() {
		return a.toUpperCase();
	}
	
	String reverse() {
		for (int i = a.length()-1; i>= 0 ; i--) {
			b = b + a.charAt(i);
		}
		return b;
	}
}

public class MyStringTest{
	public static void main(String args[]) {
		MyString myString = new MyString();
		
		System.out.println("myString.concat() : " + myString.concat());
		System.out.println("myString.toUpperCase() : " + myString.toUpperCase());
		System.out.println("myString.reverse() : " + myString.reverse());
	}
}
