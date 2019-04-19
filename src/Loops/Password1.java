package Loops;
import java.util.Scanner;
public class Password1 {
	//Next problem is the same but with a couple of changes
  public static void main(String[] args) {
  //ask for password until user hits correct password
 // password: secret478
//print "Welcome to your profile!" and exit the infinite loop
	        Scanner input = new Scanner(System.in);
	        int attempts = 0;
	        for(;;) {
	            System.out.println("Please enter your password");
	            String password = input.nextLine();
	            attempts++;
	            if(password.equals("secret478")) {
	                System.out.println("Welcome to your profile!");
	                break;
	            }
	            if(attempts == 3) {
	                System.out.println("Sorry, your account is locked. Try after 5h");
	            break;
	            }
	            //modify the above task:
	            //give 3 attempts to login
	            //if user fails to enter correct password within 3 attempts
	            //print "sorry, your account is locked. try after 5h"
	            //end the program
	        }
}

}