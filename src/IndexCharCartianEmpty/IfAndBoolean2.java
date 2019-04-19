package IndexCharCartianEmpty;

import java.util.Scanner;

public class IfAndBoolean2 {
public static void main(String[] args) {
	


    System.out.println("Please enter:");
    Scanner scanner = new Scanner(System.in);
    String n = scanner.next();
    
	
	int length = n.length();
    boolean forA = n.contains("a");
	boolean forB = n.contains("b");
	 
	if(length < 5 && forA == true) {
		 System.out.println("A perfect");	 
	 }
	else 
	 {
		 if (length >= 7 && length <= 10) {
		 if (forA  && forB)
			 System.out.println("B perfect");
	 }
	else if (length < 7 || length > 10 && forB) {
	   if(forA == false) {
		 System.out.println("Perfect");
	   }
	 }
	 else if (length < 7 || length > 10 && forB == true && forA == true) {
		 System.out.println("");
	 }
	 else {
		 System.out.println("Sorry");
	 }

	 
		
	}
}
}
