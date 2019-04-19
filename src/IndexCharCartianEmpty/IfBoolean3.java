package IndexCharCartianEmpty;
import java.util.Scanner;
public class IfBoolean3 {
   public static void main(String[] args) {
	System.out.println("Please enter:");
	Scanner sc = new Scanner(System.in);
	String n = sc.nextLine().toLowerCase();
    boolean fora = n.contains("a");
    boolean fore = n.contains("e");
    boolean fori = n.contains("i");
    boolean foro = n.contains("o");
    boolean foru = n.contains("u");
	
    if(fora  || fore  || fori || foro || foru ) {
    	System.out.println("Vowel");
    }
    else { 
    	System.out.println("Not Vowel");
    }
}
}
