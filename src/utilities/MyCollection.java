package utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {

	public static ArrayList<String> removeDuplicates(ArrayList<String> duplicate) {
		ArrayList<String> newArray = new ArrayList<>();
		for (String words : duplicate) {
			if (!newArray.contains(words)) {
				newArray.add(words);
			} 
			
		}
		return newArray;
	}

	public static ArrayList<String> filterList(ArrayList<String> words, int length) {

		ArrayList<String> newList = new ArrayList<String>();
		for (String word : words) {
			if (word.length() == length) {
				newList.add(word);
			}
		}
		return newList;
	}

	public static ArrayList<String> getStringList() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> newArray = new ArrayList<String>();
		String YesNo;
		do {
			System.out.println("Please enter String");
			newArray.add(sc.nextLine());
			System.out.println("Do you wanna to enter more? Y/N");
			YesNo = sc.nextLine().toLowerCase();

		} while (YesNo.equals("y"));
		System.out.println("Your list of string returned");
		return newArray;
	}
}
