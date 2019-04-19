package IndexCharCartianEmpty;
import java.util.Scanner;
public class Containss {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String str;
	    boolean multipleWords;
	    System.out.println("Please enter the string!");
	    str = input.nextLine(); //.trim();gibi eklenerek de bir satir codetan kurtulabilirsiniz.
	    
	    
	    System.out.println("What is your name?");
	    String name = input.nextLine();
	    if(str.isEmpty()) {
	        System.out.println("Please enter data");
	        
	    }else {
	        
	    //Modify a program to check if user entered same data or empty string.
	    //if user entered empty string then print "Please enter data"
	    //If user entered valid data then check if multiple words or not.
	    str = str.trim();
	    boolean check = str.contains(" ");
	    if(check) {
	        multipleWords = true;
	    }else {
	        multipleWords = false;
	    }
	    System.out.println("Multiple words: " + multipleWords);
	}
	
	
	}
	
}
