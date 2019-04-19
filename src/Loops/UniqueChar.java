package Loops;

public class UniqueChar {
public static void main(String[] args) {
	String name = "Javaa";
	String space = "";
	
	for(int i = 0; i < name.length();i++) {
	
		char c = name.charAt(i);
	
		if(!space.contains(c+"")) {
			space+=c;
		}
	}
	System.out.println(space);
}
}
