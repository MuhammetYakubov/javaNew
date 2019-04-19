package ifelsestatements;
import java.util.Scanner;
public class IfTask1 {
     public static void main (String[] args) {
    	 System.out.println("Please enter the time to check campus: ");
    	 Scanner sc = new Scanner (System.in);
    	 int time = sc.nextInt();
    	 boolean question = true;
    	 if (time >= 0 && time <=24) {
    	 if (time >= 8 && time < 24 ) {
    		
    	 }
    	 else {
    	   question = false;	
    	   System.out.println("open time at 8 pm until 23:59 pm");
    	 }   
    	 System.out.println("Campus open: " + question);
    	 
    	 }
    	 else {
    		 System.out.println("invalid time try again");
    	 }
     }
}
