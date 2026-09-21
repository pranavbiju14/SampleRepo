package polymorphism;

public class Dog extends Animal{

	public void sound() {
		super.sound();
		System.out.println("Dog Barks");
	}
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.sound();

	}

}
