package switchStatements;
import java.util.Scanner;
public class SwitchTask1 {
   public static void main (String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Please enter your age: ");
	   int age = sc.nextInt();
	   
	   switch (age) {
	   case (2):
		   System.out.println("toddler");
       break;
	   case (3):
	   case (4):
	   case (5):
		   System.out.println("early childhood");
	   break;
	   case (6):
	   case (7):
		   System.out.println("young reader");
	   break;
	   case (8):
	   case (9):
	   case (10):
		   System.out.println("elementary");
	   break;
	   case (11):
	   case (12):
	       System.out.println("middle");
	   break;
	   case (13):
		   System.out.println("impossible");
	   case (14):
	   case (15):
	   case (16):
		   System.out.println("high school");
	   case (17):
	   case (18):
		   System.out.println("scholar");
	   default :
		   System.out.println("ineligible");
	   
	   }
   }
}
