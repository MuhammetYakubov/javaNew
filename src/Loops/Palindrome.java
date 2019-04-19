package Loops;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter the polindrome word");	
	String reversed = "";
	String name = sc.nextLine();
	
	for(int i = name.length()-1;i >= 0 ; i--) {
		System.out.println(name.charAt(i));
	reversed = reversed + name.charAt(i);
	
	}
	if(name.equalsIgnoreCase(reversed)) {
		System.out.println("Polindrome");
	}
	else {
		System.out.println("Not polindrome");
	}
//	System.out.println("Please enter the word:");
//	String word = sc.nextLine();
//	int lastIndex = word.length() - 1;
//	boolean check = true;
//	
//	for(int i = 0; i < word.length(); i++) {
//		if(word.charAt(i) != word.charAt(lastIndex)) {
//			System.out.println("Not palindrome");
//			check = false;
//			break;
//		}
//		lastIndex--;
//	}
//	if(check) {
//		System.out.println("Palindrome");
//	}
}


}

