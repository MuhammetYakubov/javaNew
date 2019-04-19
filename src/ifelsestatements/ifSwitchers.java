package ifelsestatements;
import java.util.Scanner;

public class ifSwitchers {
      public static void main (String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
      String name = sc.nextLine();
    
		 if (name.equals("John")) {
	    	System.out.println("Hey what's up");
	    }
	 else if (name.equals("Jessy")) {
		 System.out.println("Jessy week?!");
	 }
	 else if (name.equals("Maks")) {
		 System.out.println("Maks is ok name");
	 }
	 else {
		 System.out.println("anything else");
	 }
   }
}