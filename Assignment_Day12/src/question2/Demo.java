package question2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	Citizen citizen = new Citizen();
	public boolean validate(String name, String mobileNum, String aadharCard) {
		int flag = 0;
		if(Pattern.matches("[a-zA-Z]{3,9}", name)) {
			flag++;
		}	
		if(Pattern.matches("[6789]{1}[0-9]{9}", mobileNum)) {
			flag++;
		}
		if(Pattern.matches("[0-9]{4}[0-9]{4}[0-9]{4}", aadharCard)) {
			flag++;
		}
		if(flag==3) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Citizen citizen = new Citizen();
		Demo d1 = new Demo();
		
		System.out.println("Enter your Name: ");
		String name = scanner.next();
		
		System.out.println("Enter your Mobile #: ");
		String mobileNum = scanner.next();
		
		System.out.println("Enter your Aadhar #: ");
		String aadharCard = scanner.next();
		
		boolean check = d1.validate(name, mobileNum, aadharCard);
		if(check) {
			citizen.setName(name);
			citizen.setMobileNumber(mobileNum);
			citizen.setAadharNumber(aadharCard);
			citizen.showDetails();
		}else {
			System.out.println("Enter valid input!");
			
		}scanner.close();
		
		

	}

}
