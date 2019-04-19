package methods;

public class StringTask {
public static void main(String[] args) {
	System.out.println(check("conseq uences"));
	String w = "concert";
	System.out.println(remove3letters(w, "nce"));
	
}


public static String remove3letters(String word, String letters) {
	word = word.toLowerCase().trim();
	if(word.contains(" ") || word.length() < 3) {
		System.out.println("Invalid data");
		return "";
	}
	if(word.contains(letters)) {
		return word.replace(letters, "");
	}else {
		return word;
	}
}



public static String check(String n) {

	if(n.contains(" ") || n.length() <= 3) {
		System.out.println("Invalid data");
		return "";	
	}
	if ( n.contains("con")) {
		n = n.replace("con", "");
		return n;
	}else {
		return n;
	}
	
	
}
}
