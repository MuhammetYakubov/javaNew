package arrayDataDriven;

import java.util.Arrays;

public class Splits {
public static void main(String[] args) {
	String s = "Hello people over there";
	String words [] = s.split(" ");
	System.out.println(Arrays.toString(words));
	
	String ss = "Hellopeople";
	String wordss [] = ss.split("p");
	System.out.println(Arrays.toString(wordss));
}
}
