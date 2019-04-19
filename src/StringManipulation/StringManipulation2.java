package StringManipulation;
import java.util.Scanner;
public class StringManipulation2 {
 public static void main (String[] args) {
	 System.out.println("Please enter your String");
	 
	 Scanner sc = new Scanner (System.in);
	 
     String name1 = sc.nextLine();//.trim();
	 name1 = name1.trim();
	 boolean bool = name1.contains(" ");
	 System.out.println("Multiple word: "+bool);
	 
 }
}
