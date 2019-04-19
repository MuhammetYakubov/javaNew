package ifelsestatements;
import java.util.Scanner;
public class EsensTask2 {
   public static void main (String[] args) {
	 Scanner sc = new Scanner (System.in);
	   double num1,num2,result;
	   result = 0;
	   boolean invalidOperator = false;
	   System.out.println("Please enter your firt num");
	 
	   num1 = sc.nextDouble();
	   System.out.println("Please enter your second num");
	   num2 = sc.nextDouble();
	   System.out.println("Please choose operator from below options:\n"+"+,-,*,/");
	   String name1 = sc.next();
	   
	   switch(name1) {
	   case"+":
		   //System.out.println(num1 + num2);
		   result = num1 + num2;
	       break;
	   case"-":
		   //System.out.println(num1 - num2);
		   result = num1 - num2;
		   break;
	   case"*":
		   //System.out.println(num1 * num2);
		   result = num1 *num2;
		   break;
	   case"/":
		   //System.out.println(num1 / num2);
		   result = num1 /num2;
		   	   default:
			  System.out.println("invalid operator.Please try again");
	         invalidOperator = true; 
	   }
	   
	  if (!invalidOperator) {
		  //!false -> true
		  //!true ->false
		  System.out.println("result of " +num1+" "+ name1+" "+ num2+" "+ "is "+result  );
	  }
   }
}
