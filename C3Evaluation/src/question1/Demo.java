package question1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int arraylength = scanner.nextInt();
		int array[] = new int[arraylength];
		System.out.println("Enter the elements in the array");
		for(int i=0; i<arraylength; i++) {
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the index of the array element you want to access");
		int index = scanner.nextInt();
		scanner.close();
		
		try {
			System.out.println("The array element at index "+index+" = "+array[index]);
			System.out.println("The array element successfully accessed");
			
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("The index you have entered is invalid");
		}
		
	}
}
