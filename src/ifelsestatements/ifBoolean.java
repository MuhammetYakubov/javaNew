package ifelsestatements;
import java.util.Scanner;
public class ifBoolean {
    public static void main (String[] args){

    	System.out.println("Please enter: ");
    	Scanner sc = new Scanner (System.in);
    	int n = sc.nextInt();
    	int remainder = n % 2;
        boolean condition = false;
    	 // NOTE: Please assign and use boolean inside the if statement Ex: if(condition) {}
    	    // You may require more than one boolean, feel free to create instance variables
    	   /* Given an integer, n , perform the following conditional actions:
    	    	If  is odd, print Weird
    	    	If  is even and in the inclusive range of 2 to 5, print Not Weird
    	    	If  is even and in the inclusive range of 6 to 20, print Weird
    	    	If  is even and greater than 20 , print Not Weird*/
        if(remainder != 0 ) {
        	System.out.println("Weird");
        	condition = true;
        }if (condition == false){
       
        
        if (n >= 2 && n <= 5){
        	System.out.println("Not Weird");
        }
        else if (n >=6 && n <= 20) {
        	System.out.println("Weird");
        }else {
        	System.out.println("Not Weird");
        }
        }
        	
        	
    }
}