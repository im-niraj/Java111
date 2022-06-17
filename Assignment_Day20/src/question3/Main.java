package question3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(11, "Ashish", 450));
		studentList.add(new Student(12, "Javed", 390));
		studentList.add(new Student(13, "Navin", 410));
		studentList.add(new Student(14, "Jamal", 438));
		studentList.add(new Student(15, "Komal", 451));
		studentList.forEach(System.out::println);
		
		List<Employee> employees = new ArrayList<>();
		
		studentList.forEach(n -> employees.add(new Employee(n.getRoll(),n.getName(), n.getMarks()*1000)));
		
		System.out.println("\n=================");
		employees.forEach(System.out::println);
		
	}

}
