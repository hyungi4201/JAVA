package JAVA27;
class Animal{
	public void Sound() {
		
	}
}

class Dog extends Animal{
	public void Sound() {
		System.out.println("�۸�!");
	}
}
public class DogTest {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.Sound();
}
}
