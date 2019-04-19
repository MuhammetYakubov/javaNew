package Loops;
import java.util.Scanner;
public class Password {
	  public static void main(String[] args) {
	        //ask for password until user hits correct password
	        // password: secret478
	        //print "Welcome to your profile!" and exit the infinite loop
	        Scanner input = new Scanner(System.in);
	        for(;;){
	            System.out.println("Please enter your password");
	            String password = input.nextLine();
	            if(password.equals("secret478")) {
	                System.out.println("Welcome to your profile!");
	            }break;
}
}
}