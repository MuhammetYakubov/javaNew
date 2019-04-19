package ifelsestatements;

import java.util.Scanner;
public class LoginIfElse{
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	    /* int agee = 18;
	     String name = "John";
	     String weather="rainy"; 
	     boolean check = (agee >= 21) & (name =="James");
	     System.out.println(check);*/
	    
	     int age = scan.nextInt();
	     if(age >= 0 && age <= 120){
	    	 System.out.println("valid age");
	    	   if(age >= 21) {
	  	    	 System.out.println("Welcome to Club");
	  	     }else {
	  	    	 System.out.println("Not enough age!");
	  	         int difference = 21 -age;
	  	         System.out.println("Please come back after "+difference+" years");
	  	     }   
	     }
	     else  {
	    	 System.out.println("invalid age");
	     }
    }
}
