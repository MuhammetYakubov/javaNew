package arrayDataDriven;
import java.util.Scanner;
import java.util.Arrays;
public class SplitEmail {
	public static void main(String[] args) {
		String email = "info@cybertekschool.com";
		String[] name = email.split("@");
		int counter = 0;
		
			for(int i = 0 ; i < email.length(); i++) {
				if(email.charAt(i) == '@') {
					counter++;

				}
			}
			
			if(counter == 1 && email.contains("@") ) {
			
				System.out.println("Email id: " + name[0]);
			    System.out.println("Email domain: " + name[1]);
			}
			else {
				System.out.println("invalid email");
			}
		}
}
