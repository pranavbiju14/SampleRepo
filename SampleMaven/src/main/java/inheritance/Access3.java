package inheritance;

import accessmodifiers.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		Access1 obj = new Access1();
		obj.display1();;
		
		Access3 abc = new Access3();
		abc.display3();
	}

}
