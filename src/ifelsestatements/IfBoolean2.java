package ifelsestatements;
import java.util.Scanner;
public class IfBoolean2 {

  public static void main(String[] args) {
    
    System.out.println("Please enter:");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    
    // Your code here
    //----------------------------------------------
    // NOTE: Please assign and use boolean inside the if statement Ex: if(condition) {}
    // You may require more than one boolean, feel free to create instance variables
    int reminder = n % 2;
    boolean name = false;
    
    if (reminder == 1){
      name = true;
    }else if (reminder == 0){
      
    
    if (n > 2 && n < 5 ){
      name = false;
    }
      if (n >6 && n < 20){
      name = true;
      }
      else {
      name = false;
      }
      }
    
   if (name){
     System.out.println("Weird");
   }
   else{
     System.out.println("Not Weird");
   }
  }
  
}
