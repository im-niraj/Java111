package question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int i=0;
		do {
			System.out.println((i+1)+". Product id ");
			int id = scanner.nextInt();
			System.out.println((i+1)+". Product name ");
			String name = scanner.next();
			System.out.println((i+1)+". Product price ");
			double price = scanner.nextDouble();
			products.add(new Product(id, name, price));
			
			i++;
		}while(i<4);
//		scanner.close();
		products.forEach(e -> System.out.println(e.getProductId()+" - "+e.getProductName() +" - "+e.getProductPrice()));
		
		int choice=1;
		do {
			System.out.println("\n----------------------------");
			System.out.println("1. for sorting the product according to the productPrice");
			System.out.println("2. for sorting the product according to the productName");
			System.out.println("3 for sorting the product according to the productId");
			choice = scanner.nextInt();
			switch (choice) {
			case 1 : {
				
				Collections.sort(products, (o1, o2) -> (o2.getProductPrice() > o1.getProductPrice()) ? -1 :(o2.getProductPrice() < o1.getProductPrice()) ? 1 : 0);
				products.forEach(e -> System.out.println(e.getProductId()+" - "+e.getProductName() +" - "+e.getProductPrice()));
				break;
			}
			case 2 : {
				Collections.sort(products, (o1, o2) -> o1.getProductName().compareTo(o2.getProductName()));
				products.forEach(e -> System.out.println(e.getProductId()+" - "+e.getProductName() +" - "+e.getProductPrice()));
				
				break;
			}
			case 3 : {
				Collections.sort(products, (o1, o2) -> (o2.getProductId() > o1.getProductId()) ? -1 :(o2.getProductId() < o1.getProductId()) ? 1 : 0);
				products.forEach(e -> System.out.println(e.getProductId()+" - "+e.getProductName() +" - "+e.getProductPrice()));
				
				break;
			}
			default : {
				products.forEach(e -> System.out.println(e.getProductId()+" - "+e.getProductName() +" - "+e.getProductPrice()));
			}
			
			}
		}while(choice>0 && choice<4);
		scanner.close();
		
	}

}
