package Arrayss;

public class FirstLastChar2 {
public static void main(String[] args) {
	String[] words = {"hello", "why", "by", "apple" , "note"};
	
	for(int i = 0; i < words.length; i++) {
		char first = words[i].charAt(0);
		char last = words[i].charAt(words[i].length()-1);
		
		String space = first + "" + last + "";
	
	System.out.println(space);
}
	}
}
