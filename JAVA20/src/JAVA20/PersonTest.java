package JAVA20;
class Person{
	private String lastname;
	private String firstname;
	
	String getLastName() {
		return lastname;
	}
	String getFirstName() {
		return firstname;
	}
	
	public Person(String lastname, String firstname) {
		this.lastname = lastname;
		this.firstname = firstname;
	}
	
	public String buildName() {
		return String.format("%s %s\n", this.getLastName(), getFirstName());
	}
}

public class PersonTest {
	public static void main (String args[]) {
		Person person = new Person("ȫ", "�浿");
		System.out.println(person.buildName());
	}
}
