package question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCity {

	public static void main(String[] args) {
		List<City> cityList = new ArrayList<>();
		
		cityList.add(new City("Delhi"));
		cityList.add(new City("Mumbai"));
		cityList.add(new City("Kanpur"));
		cityList.add(new City("Bangaluru"));
		cityList.add(new City("Chennai"));
		cityList.add(new City("Hydrabad"));
		cityList.add(new City("Ahemdabad"));
		
		cityList.forEach(System.out::println);
		
		
		System.out.println("\n----Ascending order-------------------");
		Collections.sort(cityList, (c1,c2)-> c1.getCityName().compareTo(c2.getCityName()));
		cityList.forEach(System.out::println);
		
		System.out.println("\n----Dscending order-------------------");
		Collections.sort(cityList, (c1,c2)-> c2.getCityName().compareTo(c1.getCityName()));
		cityList.forEach(System.out::println);
		

	}

}
