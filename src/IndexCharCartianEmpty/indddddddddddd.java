package IndexCharCartianEmpty;
import java.util.Scanner;
public class indddddddddddd {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enteeer the word quickly!!!");
	String name = sc.nextLine();
	
	int length1 = name.length();
 	
	if( name.length()%2 == 1) {
	char middleWord = name.charAt(length1/2);
		
	System.out.println(middleWord);	
	
	
	}
	
}
}
