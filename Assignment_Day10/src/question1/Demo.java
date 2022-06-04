package question1;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount) {
		if(amount > 1000) {
			return new TajHotel();
		}
		else if(amount >200 && amount <=1000) {
			return new RoadSideHotel();
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter amout");
		int amount = scanner.nextInt();
		scanner.close();
		Hotel hotel = new Demo().provideFood(amount);
		if(hotel != null) {
			hotel.chickenBiryani();
			hotel.masalaDosa();
			if(hotel instanceof TajHotel) {
				TajHotel tjHotel = (TajHotel)hotel;
				tjHotel.welcomeDrink();
			}
		}
		else {
			System.out.println("Please Enter a valid amount");
		}
		
		

	}

}
