package IndexCharCartianEmpty;

import java.util.Scanner;

public class striiing {
   public static void main (String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("please enter your name:");
	   String name = sc.nextLine().trim();
	   if (name.isEmpty()) {
		   System.out.println("You didn't write your name");
	   }else {
		   System.out.println("Your name :" +name);
	   }
	   
   }
}
