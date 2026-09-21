package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {

	public SuperConstructorChild() {
		super();
		System.out.println("CHILD");
	}
	public static void main(String[] args) {
		SuperConstructorChild obj = new SuperConstructorChild();

	}

}
