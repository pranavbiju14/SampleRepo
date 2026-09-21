package inheritance;

public class HeirarchicalChild2 extends HeirarchicalParent {
	public void display() {
		System.out.println("This is the Second Child");
	}
	public static void main(String[] args) {
		HeirarchicalChild2 obj = new HeirarchicalChild2();
		obj.print();
		obj.display();

	}

}
