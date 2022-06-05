import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println(" ======== Start of the main ======== ");
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter num 1 :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num 2 :");
		int num2 = sc.nextInt();
		sc.close();
		String message = null;
		int num3 = num1/num2;
		if(num3>10) {
			message = "Welcome to Exception Handling";
		}
		System.out.println("Message is "+ message.toUpperCase());
		System.out.println(" ======== End of the main ======== ");
		sc.close();
		}
		catch(ArithmeticException ae) {
			System.out.println("num2 should not be 0");
		}
		catch(NullPointerException npe) {
			System.out.println("String value is null");
		}
		catch(InputMismatchException ime) {
			System.out.println("Please enter a valid number");
		}

	}

}
