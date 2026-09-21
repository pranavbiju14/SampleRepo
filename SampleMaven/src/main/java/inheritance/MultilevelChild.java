package inheritance;

public class MultilevelChild extends MultilevelParent {
	public void display()
	{
		System.out.println("this is the Child");
	}
	public static void main(String[] args) {
		MultilevelChild obj = new MultilevelChild();
		obj.print();
		obj.show();
		obj.display();

	}

}
