package NestedLoops;
import java.util.Scanner;
public class VowelAndConsonantLetters {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input an alphabet:");
	String str = sc.nextLine().toLowerCase();
	
//	boolean upperCase = str.charAt(0) >= 65 && str.charAt(0) <= 90;
	boolean lowerCase =  str.charAt(0) >= 97 && str.charAt(0) <= 122;
		
		if(str.length() > 1 || (!(lowerCase))) {
			System.out.println("ERROR.It should be exactly 1 character length!");
	}
		
		else {
			
		
		 if (str.equals("a") || str.equals("u") || str.equals("e") || str.equals("i") || str.equals("o")) {
			System.out.println("Input letter is Vowel");
		}
		else {
			System.out.println("Input letter is Consonant");
		}
}
}
}
