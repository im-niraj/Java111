package question3;

import java.util.Scanner;

public class IPL {
	public void homeTeamStadium(Stadium stadium) {
		
		switch(stadium.toString()) {
		case "EDEN_GARDENS_STADIUM" : System.out.println("This is the home ground of KKR");
		break;
		case "WANKHEDE_STADIUM" : System.out.println("This is the home ground of Mumbai Indians");
		break;
		case "CHIDAMBARAM_STADIUM" : System.out.println("This is the home ground of CSK");
		break;
		case "M_CHINNASWAMY_STADIUM" : System.out.println("This is the home ground of RCB");
		default:
			break;
		}
		
	}

	
	public static void main(String[] args) {
		IPL ipl = new IPL();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stadium name: ");
		String stadiumName = sc.next();
		sc.close();
		Stadium stadiumm = Stadium.valueOf(stadiumName);
		ipl.homeTeamStadium(stadiumm);

	}

}
