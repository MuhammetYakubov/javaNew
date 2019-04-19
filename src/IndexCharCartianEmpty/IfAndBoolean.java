package IndexCharCartianEmpty;
import java.util.Scanner;
public class IfAndBoolean {
	public static void main(String[] args) {
		
	
    System.out.println("Please enter:");
    Scanner scanner = new Scanner(System.in);
    String n = scanner.next();
    
    // Your code here
    //------------------------------------------------
  if(n.contains("a") && n.length() < 5){
    System.out.println("A Perfect");
  }else
   if (n.contains("b") && n.contains("a") && n.length() > 7 && n.length() < 10){
      
      System.out.println("B Perfect");
    }
    
     if(n.contains("b") && (!n.contains("a"))){
        System.out.println("Perfect");
     } 
    else if(n.contains("a")) {
    	  System.out.println("p");
      }
    
  else{
    System.out.println("sorry");
  }
}
}
