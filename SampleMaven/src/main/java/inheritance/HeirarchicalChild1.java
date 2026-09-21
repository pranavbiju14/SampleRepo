package inheritance;

public class HeirarchicalChild1 extends HeirarchicalParent {
	public void show() {
		System.out.println("This is the First Child");
	}
	public static void main(String[] args) {
		HeirarchicalChild1 obj = new HeirarchicalChild1();
		obj.print();
		obj.show();

	}

}
