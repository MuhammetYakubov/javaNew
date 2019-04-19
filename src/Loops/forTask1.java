package Loops;
import java.util.Scanner;
public class forTask1 {
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
	System.out.println("Please enter your word");
    String word = input.nextLine().toLowerCase().replace(" ", "");
    String uniqueWord = "";
    
    for(int i = 0; i < word.length(); i++) {  
        if(!uniqueWord.contains(word.substring(i, i+1))) {
            uniqueWord += word.substring(i, i+1);
         
      }
}             System.out.println(uniqueWord);


//System.out.println("Enter a String:");
//String str= input.nextLine().trim().toLowerCase();
//
//str= str.replace(" ", "");
//
//String word1 = "";
//
//for(int index= 0; index < str.length(); index++) {
//	
//	char c= str.charAt(index);
//	String newC= c + "";
//	
//	if(!word1.contains(newC)) {
////		continue;
//		word1 += c;
//	} 
//	
//}
//
//System.out.println(word1);


}
}