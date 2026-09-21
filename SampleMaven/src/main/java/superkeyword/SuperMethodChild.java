package superkeyword;

public class SuperMethodChild extends SuperMethodParent {

	public void show() {
		super.display();
		System.out.println("HOW ARE YOU ?");
	}
	public static void main(String[] args) {
		SuperMethodChild obj = new SuperMethodChild();
		obj.show();

	}

}
