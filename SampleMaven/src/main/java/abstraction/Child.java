package abstraction;

public class Child extends Parent {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
		obj.display();

	}

	@Override
	public void display() {
		System.out.println("ABSTRACT METHOD");
		
	}

}
