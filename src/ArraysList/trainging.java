package ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class trainging {
	public static void main(String[] args) {

		String[] arr = {"blah","apple","banana"};
		
		String word = "";
		for(int j = 0; j < arr.length; j++){
			
		  word += arr[j].substring(0,3) + " ";
		  
		}
		System.out.println(word);
	}
		
	
	

//	public String printList(ArrayList<ArrayList<String>> nestedList) {
	public String blogDb(ArrayList<String[]> r, String id) {
		String word = "";
		for (String[] i : r) {

			for (String j : i) {
				if(j.contains(id)) {
					word += Arrays.toString(i);
				}
			}
		}
		word =word.split(",")+"";
		return word+"/n";
	}
}
