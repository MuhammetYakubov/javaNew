package StringManipulation;
import java.util.Scanner;
public class StringMani {
   public static void main (String [] args) {
	   Scanner sc = new Scanner (System.in);
       System.out.println("Please enter the string");
       String str = sc.nextLine().trim();
       boolean check;
       //str = str.trim();
       //boolean check = str.cantains(" ");
       if(str.isEmpty()) {
    	   System.out.println("Please enter data");
       }else {
       if(str.contains(" ")) {
    	   check = true;
       }else {
    	   check = false;
       }
       System.out.println("Mulitiple words: " +check);
   }
}
}