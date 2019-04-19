package arrayDataDriven;
import java.util.Arrays;
public class countSplit {
public static void main(String[] args) {
	String name = "Write a program that creates a group of given size";
	String words [] = name.split(" ") ;
	System.out.println(Arrays.toString(words));
	 int counter = 0; 
	// for(int i = 0; i < words.length; i++) {
	for(String word: words) {
		
		if(word.contains("program")) {
			counter++;
		}
	}
	System.out.println(counter);
	for(int j = 0; j < 13; j++) {
		for(int k = 0; k < words.length; k++) {
			if(words[k].length() == j) {
				System.out.println(words[k]);
		}
		}
	}
	int maxLength = 0;
	for (String wordd:words) {
		if(wordd.length() > maxLength) {
			maxLength = wordd.length();
		}
	}
}
}
