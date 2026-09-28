package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		int age = 16;
		if (age>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			throw new VotingException("Age Under 18!!");
		}

	}

}
