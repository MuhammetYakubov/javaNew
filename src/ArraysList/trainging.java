package ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class trainging {
	public static void main(String[] args) {

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
