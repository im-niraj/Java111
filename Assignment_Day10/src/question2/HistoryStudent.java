package question2;

public class HistoryStudent extends Student {
	int historyMarks;
	int civicsMarks;

	public HistoryStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	double gtPercentage() {
		double totalmarks = historyMarks+civicsMarks;
		double percentage = (totalmarks/200)*100;
//		System.out.println(percentage+"%");
		return percentage;
	}

}
