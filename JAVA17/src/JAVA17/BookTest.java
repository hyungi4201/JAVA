package JAVA17;
class Book{
	private String title;
	private String author;
	
	public void setTitle(String t) {
		title = t;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
}
public class BookTest {
	public static void main(String args[]) {
		Book myBook = new Book();
		
		myBook.setTitle("Power Java");
		myBook.setAuthor("천인국, 하상호");
		
		System.out.println("책의 이름은 " + myBook.getTitle());
		System.out.println("책의 저자는 " + myBook.getAuthor());
		
	}
}
