package superkeyword;

public class SuperVariableChild extends SuperVariableParent {

	String name = "BIJU";
	
	public void print() {
		System.out.print(super.name);
		System.out.print(" "+name);
	}
		public static void main(String[] args) {
			SuperVariableChild obj = new SuperVariableChild();
			obj.print();
		}
}
