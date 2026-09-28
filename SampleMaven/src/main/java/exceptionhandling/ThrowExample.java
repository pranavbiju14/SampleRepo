package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int age = 16;
		if (age>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			throw new NumberFormatException("Age Under 18!!");
		}

	}

}
