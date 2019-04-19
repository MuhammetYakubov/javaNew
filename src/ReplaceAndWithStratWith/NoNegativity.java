package ReplaceAndWithStratWith;
import java.util.Scanner;
public class NoNegativity {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your message:");
	String message = sc.nextLine().toLowerCase();
   /* message = */ String s = message.replace("hate", "love");
	System.out.println(s);
}
}
