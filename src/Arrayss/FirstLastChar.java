package Arrayss;
import java.util.*;
public class FirstLastChar {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	String [] words = {"hello", "why", "by", "apple" , "note"};
	String [] words1 = new String[5];
	
	for(int i = 0; i < words.length; i++) {
		
		//String first = +"";	
		//int last =;
		
		char c = words[i].charAt(0);
		char cc = words[i].charAt(words[i].length()-1);
		String cut = c +""+ cc +"";
		words1[i] = cut;
		
	} System.out.println(Arrays.toString(words1));
     
}
}
//input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()