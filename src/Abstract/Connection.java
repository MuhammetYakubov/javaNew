package Abstract;
import java.util.Arrays;
public class Connection {

	public static void main(String[] args) {
		//Phone p = new Phone();
		//p.call();
		
//		Nokia n = new Nokia();
//		n.call();
//		n.internetConnection();
//		
//		System.out.println();
//		Iphone i = new Iphone();
//		i.call();
//		i.internetConnection();
		
		 String email = "info@cybertekschool.com";
		    
		    //Write your code belo
		    
		    //Write your code below
		      if(email.contains("@")){
		      
		    String [] arr = email.split("@");
		    System.out.println("Email id: " + (arr[0]));
		    System.out.println("Email domain: " + (arr[1]));  
		    }
	
}
}
