package Arrayss;
import java.util.*;
public class CityTask {
public static void main(String[] args) {
	String[] cities = {"New York","Madison","Miami","Chicago","Chicago","Chicago"};
	int counter = 0;
	//boolean check = true;
	for(int i = 0; i < cities.length; i++) {
		if(cities[i].equalsIgnoreCase("Chicago")) {
			System.out.println("Windy city found");
			counter++;
			//check = false;
			break;
		}
		//check
	}if(counter == 0) {
		System.out.println("Windy city not found");
	}
	int counter1 = 0;
	for(int j = 0; j < cities.length; j++) {
		
		if(cities[j].equalsIgnoreCase("Chicago")) {
			counter1++;
			
		}
	}if(counter1 > 0) {
		System.out.println("Number of chicago " +counter1);
	}
	
}
}
