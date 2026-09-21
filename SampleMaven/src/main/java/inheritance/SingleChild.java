package inheritance;

public class SingleChild extends SingleParent {
	public void show() {
		System.out.println("Child Class");
	}
	public static void main(String[] args) {
		SingleChild obj = new SingleChild();
		obj.print();
		obj.show();

	}

}
