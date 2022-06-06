package question3;

import java.util.Scanner;

public class Demo {
	public void showDetails(Month m) {
		System.out.println(m);
		Month[] month = Month.values();
		int i=0;
		for(Month m1:month) {
			i++;
			if(m1.equals(m)) {
				m1.info(i);
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sort name of month");
		String string = scanner.next();
		try {
			Month m = Month.valueOf(string.toUpperCase());
			scanner.close();
			new Demo().showDetails(m);
		} catch (Exception e) {
			System.out.println("Invalid Month Name: "+e);
		}
		
		
		

	}

}
