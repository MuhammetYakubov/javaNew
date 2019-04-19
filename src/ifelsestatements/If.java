package ifelsestatements;

import java.util.Scanner;

public class If {
      public static void main (String[] args) {
    	  Scanner sc = new Scanner (System.in);
    	  String username = "test";
    	  String password = "test123";
    	  System.out.println("please enter your username");
    	  String userName = sc.nextLine();
    	  System.out.println("please enter your password");
    	  String passWord = sc.nextLine();
    	  

    	  
    	  
    	  if (userName.equals(username) && passWord.equals(password));
    	  {System.out.println("Welcome "+username);
    	  }
    	  // if username is correct but password is incorrect print "password incorrect"
		 if(userName.equals(username) && !passWord.equals(password)) {
			System.out.println("Invalid passworw");
		}
		// if username is incorrect but password is correct print "username incorrect"
		else if(!userName.equals(username) && passWord.equals(password)) {
			System.out.println("Invalid username");
		}
		// else print invalid credential
		else {
			System.out.println("Invalid Credentials");
		}
		// ! -> negative !str.equals(str2);
    	  
    	  
    	 /* */
    	  
      }
}
