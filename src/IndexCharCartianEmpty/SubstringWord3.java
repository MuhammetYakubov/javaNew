package IndexCharCartianEmpty;
import java.util.Scanner;
public class SubstringWord3 {

	 public static void main(String[] args) {
		    System.out.println("Please enter word:");
		    Scanner scanner = new Scanner(System.in);
		    String n1 = scanner.nextLine();
		    
		    // Your code here
		    //------------------------------------------------
		     
		        boolean w = n1.length()%2 ==1;
		         int word = n1.length();
		         if(w && word >=5){
		           char n2 = n1.charAt(word/2-1);
		           char n3 = n1.charAt(word/2);
		           char n4 = n1.charAt(word/2+1);
		           String g = n2 + "" + n3 + n4;
		           System.out.println(g);
		         }
		  }
	
	
}
