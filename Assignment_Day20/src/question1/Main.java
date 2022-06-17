package question1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Student> listStudents = new ArrayList<>();
		listStudents.add(new Student(101, "Mohit", 880));
		listStudents.add(new Student(102, "Sashank", 720));
		listStudents.add(new Student(103, "Lochani", 790));
		listStudents.add(new Student(104, "Kovela", 810));
		listStudents.add(new Student(105, "Arjun", 780));
		
		List<Student> filteredList = new ArrayList<>();
		
		listStudents.stream().filter(marks -> marks.getMarks() < 800).forEach(filteredList::add);
		
		filteredList.forEach(System.out::println);
		
		
	}
}
