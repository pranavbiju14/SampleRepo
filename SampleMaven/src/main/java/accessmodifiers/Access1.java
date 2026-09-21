package accessmodifiers;

public class Access1 {
	public void display1() {
		System.out.println("PUBLIC");
	}
	private void display2() {
		System.out.println("PRIVATE");
	}
	protected void display3() {
		System.out.println("PROTECTED");
	}
	void display4() {
		System.out.println("DEFAULT");
	}
	
	public static void main(String[] args) {
		Access1 obj = new Access1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();

	}

}
