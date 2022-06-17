package question2;

public class InvalidAge extends Exception{
	InvalidAge() {
		super("Age should not be in the future");
	}
	InvalidAge(String message) {
		super(message);
	}
}
