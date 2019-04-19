package StringManipulation;
import java.util.Scanner;
public class StringManipulationn {
   public static void main (String[] args) {
	   System.out.println("Plaese enter what you need:");
	   String name = "Lowrence";
	   String name2 = "Given an integer, n , perform the following conditional actions:\r\n" + 
	   		"If  is odd, print Weird\r\n" + 
	   		"If  is even and in the inclusive range of 2 to 5, print Not Weird\r\n" + 
	   		"If  is even and in the inclusive range of 6 to 20, print Weird\r\n" + 
	   		"If  is even and greater than 20 , print Not Weird";
	   Scanner sc = new Scanner(System.in);
	   String nn = sc.nextLine();
	   boolean check = name.contains(nn);// returns boolean.
	   System.out.println(check);
//   name.toUpperCase();
//   name.toLowerCase();
   }
} 

