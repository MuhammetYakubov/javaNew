package Arrayss;

import java.util.*;

public class Task1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter number of cars you have:");
	int num = sc.nextInt();
	
	sc.nextLine();
	String[] garage = new String[num];
    System.out.println(Arrays.toString(garage));
	boolean yes = true;
	for(int i = 0; i < num; i++) {
		System.out.println("Please enter the name of car " +(i+1)+":");
		String name = sc.nextLine();
		garage[i] = name;
} 
	System.out.println(Arrays.deepToString(garage));
	int counter = 0;

	for(int k = 0; k < garage.length; k ++) {
		if(garage[k].equalsIgnoreCase("bmw") || garage[k].equalsIgnoreCase("mercedes")){
		System.out.println("you have german car");
	    counter++;
		
		break;
		}
	}if(counter == 0) {
		System.out.println("You don't have German car!");
	}
	


	//garage[0] = "BMW";
	//garage[num-1] = "Mercedes";  
	//System.out.println(Arrays.deepToString(garage));
	}
	
}
