package Loops;
import java.util.Scanner;
public class IndexLoops {
	//This last one is important to know as it is used often in interviews
	

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        //write a program that reverses a String. Ask for a word and reverse the word
	        //ex: input: James, output: semaJ
	        System.out.println("Please enter a word");
	        String word = input.nextLine();
	        int lastIndex = word.length()-1;
	        
	        for(int i = lastIndex; i>=0; i--) {
	            System.out.print(word.charAt(i));
	            
	            }
}
}