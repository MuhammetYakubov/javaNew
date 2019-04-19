package Presentation;

import java.util.Random;
import java.util.Scanner;

public class random {
 public static void main (String[] args) {
	 Random rn = new Random();
	 Scanner cn = new Scanner(System.in);
	 System.out.println("Please enter your number"); 
	 int secretNumber = rn.nextInt(10);
	 int scanner = cn.nextInt();
	 boolean found =false;
	 if(secretNumber >scanner) {
		 System.out.println("Your number is too loww ");
		 System.out.println("the secret number is "+secretNumber );
		 
	 }
	 else if (secretNumber < scanner) {
		 System.out.println("Yuor guess is too high ");
		 System.out.println("secret number is " +secretNumber);
	 }
	 else  {
		 System.out.println(" Congratulations! \n the secret number is "+secretNumber );
		 found = true;
	 }
	 System.out.println("found: "+ found);
	 
	 if(found == false) {
		 System.out.println("This is your last chance. Please guess the number:");
		 int secondGuess  = cn.nextInt();
		 if(secondGuess == secretNumber) {
			 System.out.println("Congratulations!");
		 }else {
			 System.out.println("yuo lost!!");
			 System.out.println("secret number is "+secretNumber);
		 }
	 }
	 
}
}
