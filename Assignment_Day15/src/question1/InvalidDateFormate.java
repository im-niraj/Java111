package question1;

public class InvalidDateFormate extends Exception {
	
	
	InvalidDateFormate() {
		super("Invalid Date Format");
	}
	
	InvalidDateFormate(String message) {
		super(message);
	}

}
