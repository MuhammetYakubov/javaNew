package myTeam;
import java.util.Scanner;
public class MondayTask11 {
public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Please enter number:");
  
    
    // TASK 1
    int x = input.nextInt();
    
    //your code here 
    //----------------------------------------------------------
    for(int i = 1; i < x; i++){
      if(i%2==0 && i%3==0){
        System.out.print(i*i + " ");
      }
    }
    
  
    //----------------------------------------------------------
    
    //TASK 2
    System.out.println("");
    System.out.println("Enter word:");
    String str2 = input.next();
    
    //your code here 
    //---------------------------------------------------------- 
  
  if(str2.length()>=3 && str2.length() <= 100){
	  
	  for(int i = 0; i < str2.length(); i++){
		  
		  char check = str2.charAt(i);
  if (check > 48 && check < 57){
	  System.out.print(check);
	  }
  }
	  }
     else{
    	 System.out.println("Invalid enter");
    	 }
    
    
    
    
    //----------------------------------------------------------
    
    //TASK 3
    //your code here 
    //----------------------------------------------------------
   System.out.println("");
    int positive = 0;
    int negative = 0;
    int zeros = 0;
    String reply;
    do{System.out.println("Enter the number:");
    int enteredNum = input.nextInt();
    System.out.println("Do you want to continue y/n?");
    reply = input.next();
    if(enteredNum==0) {
    	zeros++;
    	}
    if(enteredNum>0){
    	positive++;
    	}
    else if(enteredNum<0){
    	negative++;
    	}
    }
while(reply.equals("y"));
    System.out.println("Positive numbers:"+positive);
    System.out.println("Negative numbers:"+negative);
    System.out.println("Zero numbers:"+zeros);
    
    
  }
}