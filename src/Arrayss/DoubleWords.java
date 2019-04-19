package Arrayss;

public class DoubleWords {
public static void main(String[] args) {

	String[] words = {"knife", "wooden spoons", "plates", "cups", "forks", "pan", "pot", "trash can", "fridge", "dishwasher"};
	
	for(int i = 0; i < words.length; i++) {
	    if(words[i].trim().contains(" ")) { 
	    System.out.println(words[i]);
	}
	}
}
}
