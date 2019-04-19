package Presentation;
import java.util.Scanner;
public class SpecialJames {
   public static void main (String[] args) {
	   Scanner sc = new Scanner (System.in);
	   System.out.println("Please enter your name:");
	   String name = sc.nextLine();
	  
	   if (name.equals("james")) {
		   System.out.println("enter your second name ");
		   	   
	 
	   }
	   else {
		   System.out.println("nobody");
	   }
	   String name2 = sc.nextLine();
	   if (name2.equals("bond")){
		   System.out.println("first name: " +name);
		   System.out.println("second name: "+name2);
	   }
	   else {
		   System.out.println("noobody");
	   }

   }
}
