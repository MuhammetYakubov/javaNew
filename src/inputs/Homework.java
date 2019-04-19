package inputs;

import java.awt.Frame;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
        
		System.out.println("Program runnig:\n ");
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Please enter username:");
		name = sc.nextLine();
		
		System.out.println("Please enter password: ");
		String name2;
		name2 = sc.nextLine();
		
		System.out.println("\n\tWelcome,"+name);
		System.out.println("Profile\t   "+ "Pictures\t "+"Videos ");
		System.out.println("Posts\t   " +"Likes\t " +"Comments\t ");
	    System.out.println("Products   "+"Orders\t " + "Feedbacks\t\n ");
	
	    String firstName,lastName,address ,answer;
	    int creditCard;
	    
	    System.out.println("Program running:\n");
	    System.out.println("Profile edit Page");
	    System.out.println("First Name:");
	    firstName = sc.nextLine();
	    
	    System.out.println("Last Name:");
	    lastName = sc.nextLine();
	    
	    System.out.println("Address:");
	    address = sc.nextLine();
	    
	    System.out.println("Credit Card Numer:");
	    creditCard = sc.nextInt();
	    
	    System.out.println("\nInfromation you entered:");
	    System.out.println("Name: "+ firstName);
	    System.out.println("Address: " + address);
	    System.out.println("CC Number: " + creditCard);
	    
	    System.out.println("Save now?\n");
	    answer = sc.nextLine();
	    
	    sc.nextLine();
	    System.out.println("Thank you");
	    
	    	    
	}
}
