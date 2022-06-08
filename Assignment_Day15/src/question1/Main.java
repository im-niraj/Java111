package question1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
	public LocalDate getAge(String age) {
		try {
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate dob = LocalDate.parse(age,dateTimeFormatter);
			LocalDate currentDate = LocalDate.now();
			long days = ChronoUnit.DAYS.between(dob, currentDate);
			if(days < 0) {
				System.out.println("Date should not be in Future");
			}
			else {
				return dob;
			}
		}catch (Exception e) {
			System.out.println("InvalidDateFormate " + e);
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter DOB in DD-MM-YYYY formate");
		String sgeString = scanner.next();
		scanner.close();
	    LocalDate dobDate = new Main().getAge(sgeString);
	    if(dobDate != null) {	    	
	    	System.out.println("Date of Birth:  "+dobDate);
	    }
	}

}
