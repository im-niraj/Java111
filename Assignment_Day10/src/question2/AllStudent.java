package question2;

import java.util.Scanner;

public class AllStudent {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("========Science Student========");
		System.out.println("Enter name");
		String name = scanner.next();
		System.out.println("Enter address");
		String address = scanner.next();
		System.out.println("Physics Marks");
		int physics = scanner.nextInt();
		System.out.println("Chemistry Marks");
		int chemistry = scanner.nextInt();
		System.out.println("Math Marks");
		int math = scanner.nextInt();
		
		System.out.println("========History Student========");
		System.out.println("Enter name");
		String name1 = scanner.next();
		System.out.println("Enter address");
		String address1 = scanner.next();
		System.out.println("History Marks");
		int hismark = scanner.nextInt();
		System.out.println("Civics Marks");
		int civicsmark = scanner.nextInt();
		scanner.close();
		ScienceStudent scienceStudent = new ScienceStudent(name,address);
		scienceStudent.chemistryMarks = chemistry;
		scienceStudent.mathsMarks = math;
		scienceStudent.physicsMarks = physics;
		double per1 = scienceStudent.gtPercentage();
		scienceStudent.displayDetail(per1);
		
		HistoryStudent historyStudent = new HistoryStudent(name1,address1);
		historyStudent.civicsMarks = civicsmark;
		historyStudent.historyMarks = hismark;
		double per = historyStudent.gtPercentage();
		historyStudent.displayDetail(per);
	}

}
