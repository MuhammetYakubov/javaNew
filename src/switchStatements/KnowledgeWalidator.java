package switchStatements;
import java.util.Scanner;
public class KnowledgeWalidator {
   public static void main (String [] args) {
	   System.out.println("Please write your Grade");
	   Scanner sc = new Scanner(System.in);
	   String grade= sc.nextLine();
	   
	   grade = grade.toUpperCase();
	   
	   if ( grade.length() > 1){
		   System.out.println("Invalid data.Please enter one character");  
	   }
	   else {
   switch (grade) {   
   case "A":
	   System.out.println("Great job");
	   break;
   case "B":
	   System.out.println("Ok job");
	   break;
   case "C":
	   System.out.println("Not bad");
       break;
   case "D":
	   System.out.println("Try harder");
	   break;
   case "F":
	   System.out.println("You have choosed");
	   break;
   default: 
	   System.out.println("invalid grade");
   }
   }
}
}