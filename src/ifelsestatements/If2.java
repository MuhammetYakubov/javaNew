package ifelsestatements;
import java.util.Scanner;
 public class If2{
	
	 
	 	
	 	public static void main(String[] args) {
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		//System Database/not user input.
	 		String username = "Airheem";
	 		String password = "Air-pass";
	 		
	 		//User input.
	 		System.out.println("Username:");
	 		String userInput = input.next();
	 		System.out.println("Password:");
	 		String passInput = input.next();
	 		
	 		boolean login = userInput.equals(username) && passInput.equals(password);
	 		
	 		if (login == true) {
	 			System.out.println("You are now logged in. Welcome back, " + userInput);
	 				}else {
	 					if (!userInput.equals(username)) {
	 						System.out.println("Invalid username");
	 					}
	 					if (!passInput.equals(password)) {
	 						System.out.println("Invalid password");
	 					} else {

	 						System.out.println("\nInvalid credentials, please try again.");
	 					}
	 					
	 				}
	 	        }

	          }
