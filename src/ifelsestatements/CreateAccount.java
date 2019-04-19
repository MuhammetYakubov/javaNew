package ifelsestatements;
import java.util.Scanner;
public class CreateAccount {

	
	
	public static void main(String[] args) {
			String username1 = "test";
			String username2 = "james";
//			Write a code that asks to create username from user on console.
//			Check if entered username already exists in the database. (In database
//			there are two usernames now. 
//			If entered username already exists print "username taken" else "username
//			created!
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter username to create:");
			String enterdUsername = input.nextLine();
//			un.equals(username1) || un.equals(username2)
			if(enterdUsername.equals(username1) || enterdUsername.equals(username2)) {
				System.out.println("username taken");
			}
			else {
				System.out.println("username created!");
				// ask user to enter a password to create
				// check the entered password if length is btw 5 and 12
				// if condition met then print "password created!"
				// if not give proper message to user and don't create password
				System.out.println("Please enter the password to create:");
				String password = input.nextLine();
				if(password.length() >= 5 && password.length() <= 12) {
					System.out.println("Password created successfully!");
					System.out.println("Congratulations, account is created successfully");
					System.out.println("username: " + enterdUsername);
					System.out.println("password: " + password);
				}
				else {
					System.out.println("Invalid password. Please enter length between 5 and 12");
					
				}
				
			}
			
			System.out.println("\nEnd of Program");
			
		}

	}

