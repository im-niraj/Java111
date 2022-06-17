package question2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EmployeeBonus {
	public double experience(String joiningdate) {
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate joinDate = LocalDate.parse(joiningdate,dtf);
			LocalDate currDate = LocalDate.now();
			long days = ChronoUnit.DAYS.between(joinDate, currDate);
			
			if(days>0) {
				long years = ChronoUnit.YEARS.between(joinDate, currDate);
				if(years < 1) {
					System.out.println("Bonus 5000");
				}
				else if (years >= 1 && years < 2) {
					System.out.println("Bonus 8000");
				}
				else{
					System.out.println("Bonus 10000");
				}
			}
			else {
				System.out.println(days);
				new InvalidAge();
				
			}
			
		} catch (Exception e) {
			InvalidAge ia = new InvalidAge("Please pass the date in the currect format");
			System.out.println(ia);
		}
		
		
		return 3.5;
	}
}
