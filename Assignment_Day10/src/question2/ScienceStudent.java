package question2;

public class ScienceStudent extends Student {
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;

	public ScienceStudent(String name, String address) {
		super(name, address);
	}

	@Override
    double gtPercentage() {
		double totalmarks = (physicsMarks+chemistryMarks+mathsMarks);
		double percentage = (totalmarks/300)*100;
//		System.out.println(percentage+"%");
		return percentage;
	}
	

}
