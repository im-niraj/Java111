package question1;

public class InsufficientFundsException extends Exception {
	public String toString() {
		return "Balance not sifficient";
	}
}
