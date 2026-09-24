package interfaceexample;

public class Child implements Parent{

	public void show() {
		System.out.println("JUST FOR A REFERANCE");
	}
	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
		obj.display();
		obj.show();
		//REFERANCE CREATION
		//syntax ---> Interfacename objectname = new classname();
		Parent obj1 = new Child();
		obj1.display();
		obj1.print();
	}

	@Override
	public void print() {
		System.out.println("HELLOOOO");
		
	}

	@Override
	public void display() {
		System.out.println("PRANAV");
		
	}

}
