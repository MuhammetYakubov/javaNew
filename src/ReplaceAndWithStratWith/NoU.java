package ReplaceAndWithStratWith;
import java.util.Scanner;
public class NoU {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your message:");
	String name = sc.nextLine().toLowerCase();
	name = name.replace("u", "");
	name = name.replace("U", "");
	System.out.println(name);
}
}
