package myTeam;
import java.util.Scanner;
public class MondayTask2 {
public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);  
	  
	    //----------------------------------------------------------
	    
	    //TASK 2
	    System.out.println("Enter word:");
	     String str2 = input.nextLine().toLowerCase().trim();
	        
	       int newString = str2.length()/2;
	       
	        String first = str2.substring (0,newString);                     
	        String firstEven = str2.substring (0,newString-1);               
	                                                                        
	        String last = str2.substring (newString+1);
	        String lastEven = str2.substring (newString+1);
	        
	        // int i = str2.length()/2;
	        String midOdd = str2.substring(newString, newString+1).toUpperCase();
	        System.out.println(midOdd);
	        String midEven = str2.substring(newString-1, newString+1).toUpperCase();
	        int isOdd = str2.length()%2;    
	        
	        if (str2.length() >=3 && isOdd != 0) {
	            //String mid = str2.charAt(i).toUpperCase();
	         System.out.println(first + midOdd + last);
	        }
	        
	        else if (str2.length() >=3 && isOdd == 0) {
	            //String mid = str2.charAt(i).toUpperCase();
	         System.out.println(firstEven +  midEven + lastEven);
	        }
	            
	        else if (str2.length() <3 || str2.length() > 100) {
	            System.out.println("Invalid enter");
	        }
	        
	        else {
	            System.out.println();
	        }
	    
	     
	 
	
}
}
