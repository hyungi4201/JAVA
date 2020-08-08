package JAVA20;

public class Dog {
	private String name;
	private String bread;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public String getBread() {
		return bread;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setBread(String b) {
		bread = b;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public Dog() {
		name = null;
		bread = null;
		age = 0;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.bread = null;
		this.age = age;
	}
	
	public Dog(String name, String bread, int age) {
		this.name = name;
		this.bread = bread;
		this.age = age;
	}
}
