package IndexCharCartianEmpty;
import java.util.Scanner;
public class StringConcatenation1 {
 public static void main(String[] args) {
	
	 System.out.println("Please enter two words: ");
	 Scanner sc = new Scanner (System.in);
	 
	 String n1 = sc.nextLine();
	 String n2 = sc.nextLine();
	 int num1 = n1.length()-1;
	 
     char c1 = n1.charAt(num1);
	 char c2 = n2.charAt(0);
	 
	 if(c1 == c2) {
     String name2 = n2.substring(1);	 
	 String name = n1 + name2;
	 System.out.println(name);
	
	 }else {
		 String name1 = n1 + n2;
		 System.out.println(name1);
	 }
	 
}
}
