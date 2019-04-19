package IndexCharCartianEmpty;
import java.util.Scanner;
public class StringSubstring1 {
public static void main(String[] args) {
	System.out.println("please enter word with x");
	Scanner sc = new Scanner(System.in);
	String n1 =sc.nextLine();
	
	if(n1.charAt(0)=='x' && n1.charAt(1)=='x' ) {
		System.out.println(n1.substring(2));

	}else if  (n1.charAt(1)=='x') {
		System.out.println(n1.substring(0, 1)+ n1.substring(2));
		
	}else if (n1.charAt(0)=='x') {
		System.out.println(n1.substring(1));
	}
	else{
     System.out.println(n1);
		
}
}
}

