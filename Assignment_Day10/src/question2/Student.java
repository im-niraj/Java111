package question2;

abstract class Student {
	String name;
	String address;
	abstract double gtPercentage();
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void displayDetail(double percentage) {
		System.out.println("Percentage of "+name+" is "+percentage);
	}
}
