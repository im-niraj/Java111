package question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Main main = new Main();
		EmployeeBonus employeeBonus = new EmployeeBonus();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert Joining Date in DD-MM-YYYY format");
		String inputDate = scanner.next();
		scanner.close();
	 	double bonus = employeeBonus.experience(inputDate);
	 	System.out.println(bonus);
	}

}
