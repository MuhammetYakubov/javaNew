package objectDataType;

import java.util.Scanner;

public class testHouse {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	house person1  = new house();
	
	System.out.println("Please enter type");
	person1.type = sc.nextLine();
	
	System.out.println("Please enter your address");
	person1.address = sc.nextLine(); 
	
	System.out.println("Please enter your numRooms");
	person1.numRooms = sc.nextInt();
	
	System.out.println();
	person1.info();
}
}
