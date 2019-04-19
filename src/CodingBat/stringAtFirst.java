package CodingBat;
import java.util.Scanner;
public class stringAtFirst {
	public static void main(String[] args) {	
	
		 Scanner sc = new Scanner(System.in);
		    String name = sc.nextLine();
		    for(int i = 0; i <= name.length(); i++) {
		    	if(name.length() > 2) {
		    		System.out.println(name.substring(0,2));
		    break;		
		    	}else if (name.length() <= 2) {
		    		System.out.println(name.replace(name.charAt(i), '@'));
		    	break;
		    	}
		    }
	}
}
