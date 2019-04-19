package myTeam;
import java.util.Scanner;
public class MondayTask3 {
public static void main(String[] args) {
     
	Scanner input = new Scanner(System.in);
    
    System.out.println("Enter two words(separate with space):");
    
    
    String str3 = input.nextLine().toLowerCase().trim();
        
            int i = str3.indexOf(" ");
            
            String first2 = str3.substring(0, i);
            String last2 = str3.substring (i+1);
            
          System.out.println(first2.length()+ last2.length());
           
        
        
       String firstWord = first2.charAt(0)+"";
       String secondWord = last2.charAt(0)+"";
       firstWord = firstWord.toUpperCase();
       secondWord = secondWord.toUpperCase();
      
       
       
       String firstWordStr = firstWord +"".toUpperCase();
       String noFirstCharWord1 = first2.substring(1);
       
       
       String secondWordStr =secondWord+"".toUpperCase();
       String noFirstCharWord2 = last2.substring(1);
       System.out.println(firstWord+ noFirstCharWord1 + " " + secondWord + noFirstCharWord2);
  }
}