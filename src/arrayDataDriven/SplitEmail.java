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
			
			
//---------------------------------------------------------------------------------------->
//			   if(email.contains("@")) {
//		            String [] validMail = email.split("@");
//		            if(validMail.length==2) {
//		            System.out.println("Email id: "+validMail[0]+"\nEmail domain: "+validMail[1]);
//		            }else {
//		                System.out.println("invalid email");
//		            }
//		        }else  {
//		            System.out.println("invalid email");
//		        }
//-------------------------------------------------------------------------------------------->
//			    if(email.indexOf("@") < 0 || email.indexOf("@") < email.lastIndexOf("@")) {
//	            System.out.println("invalid email");
//	        } else {
//	        String [] arr = email.split("@");
//	        System.out.println("Email id: "  + arr[0]);
//	        System.out.println("Email domain: " + arr[1]);
//	    
//	    
//	  }
		}
}
