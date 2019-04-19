package IndexCharCartianEmpty;
import java.util.*;
public class random {

	public static void main(String[] args) {
		
		
	     //Task
	//  Write a program that asks from the user to guess
	//  the random number. Random number will be generated
	//  between 0 - 10. If user finds the number
	//  print “Congratulations!”.
	// give the second chance to the user
	        
	        
	    int number, guess;
	    boolean secondChance = false;
	    
	    Scanner input = new Scanner(System.in);
	    Random random = new Random();
	    
	    number = random.nextInt(10);
	    
	    System.out.println("Please enter your guess between 0-10:");
	    guess = input.nextInt();
	    
	    if(guess > number) {
	        System.out.println("Your guess is too high.  Please try again.");
	        secondChance = true;
	    } else if(guess < number) {
	        System.out.println("Your guess is too low. Please try again.");
	        secondChance = true;
	    } else {
	        System.out.println("Congratulations!");
	    }
	    
	    if(secondChance) {
	        guess = input.nextInt();
	        if(guess == number) {
	            System.out.println("Congratulations!");
	        } else {
	            System.out.println("You lost. The number was " + number);
	        }
	    }
	}
}
