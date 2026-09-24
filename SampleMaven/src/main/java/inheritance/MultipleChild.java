package inheritance;

public class MultipleChild implements MultipleParent1 , MultipleParent2 {

	public static void main(String[] args) {
		MultipleChild obj = new MultipleChild();
		obj.print();
		obj.display();

	}

	@Override
	public void print() {
		System.out.println("HELLOO");
		
	}

	@Override
	public void display() {
		System.out.println("PRANAV");
		
	}

}
