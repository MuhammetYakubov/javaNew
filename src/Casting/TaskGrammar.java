package Casting;
import java.util.Scanner;
public class TaskGrammar {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your message:");
	String name = sc.nextLine().trim();
	int num = name.charAt(0);
	//int decimalValue = num;
	System.out.println(num);
	
	if (num >= 65 && num <= 90  && (name.endsWith(".") || name.endsWith("!"))) {
		System.out.println("Valid message");
	}else {
		System.out.println("invalid message");
	}
	
	boolean bb = Character.isUpperCase('O');
	System.out.println(bb);
	
	
	
}
}
