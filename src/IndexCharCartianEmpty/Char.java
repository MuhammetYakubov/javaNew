package IndexCharCartianEmpty;
import java.util.Scanner;
public class Char {
    public static void main (String [] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Plaese enter your name:");
    	String name = sc.nextLine();
    	
    	name.toLowerCase();
    	   
    	
        if(name.isEmpty()) {
    		System.out.println("enter valid name");
    	}else {
    		
    	
    	char first = name.charAt(0);
    	int l = name.length();
    	char second = name.charAt(l-1);
    		System.out.println(second);
    	if (first ==  'a' && second == 'z') {
    		System.out.println("cool ");
    	}
    	else {
    		System.out.println("Not very cool");
    	}
    	}
    }
}
