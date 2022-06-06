package question4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	public boolean validate(String username, String password, String mobileNumber, String email) {
		int flag1 = 0;
		if(Pattern.matches("[a-zA-Z]{3,9}", username)) {
			flag1++;
		}
		if(Pattern.matches("[0-9]{3,8}", password)) {
			flag1++;
		}
		if(Pattern.matches("[6789]{1}[0-9]{9}", mobileNumber)) {
			flag1++;
		}
		if(Pattern.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", email)) {
			flag1++;
		}
		if(flag1 == 3) {
			return true;
		}return false;
	}

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Customer customer = new Customer();
			Demo d1 = new Demo();
			
			System.out.println("Enter your username :");
			String username = scanner.next();
			
			System.out.println("Enter your password :");
			String password = scanner.next();
			
			System.out.println("Enter your mobile number :");
			String mobileNo = scanner.next();
			
			System.out.println("Enter your email :");
			String emailId = scanner.next();
			scanner.close();
			boolean flag2 = d1.validate(username, password, mobileNo, emailId);
			if(flag2) {
				customer.setUsername(username);
				customer.setPassword(password);
				customer.setMobileNumber(mobileNo);
				customer.setEmail(emailId);
				customer.showDetails();
			}else {
				System.out.println("Enter valid input");
			}
			
		}

}
