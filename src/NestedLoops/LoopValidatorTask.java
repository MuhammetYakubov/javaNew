package NestedLoops;
import java.util.Scanner;
public class LoopValidatorTask {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String num;
	
		System.out.println("Please enter the phone number:");
		num = sc.nextLine().trim();
		int l = num.length();
		
		if (!(l == 10 || l == 12 )){
			System.out.println("invalid length - must be 12 or 10 char");
		}
		else if (l == 12) {
		 if(!(num.charAt(0) == '(' && num.charAt(4) == ')')) {
			System.out.println("Invalid format - there is no closing parenthesis");
		}
		 }
		
		num = num.replace("(", "");
		num = num.replace(")", "");
		
		if(l == 10) {
		 for(int i = 0; i < num.length(); i++ ) {
			char s = num.charAt(i);
		 if(s < 48 && s > 57 ){
			 System.out.println("Invalid character - must be a number 0-9");
			break;
		}	 
		 }
		System.out.println(num+" Valid phone number");
		}
						
		

}
}
