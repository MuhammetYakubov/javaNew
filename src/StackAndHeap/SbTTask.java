package StackAndHeap;

import java.util.ArrayList;

public class SbTTask {

	public static void main(String[] args) {
		String n = "nursesrun";
		System.out.println(isPalindrome(n));
		ArrayList<String> word = new ArrayList<String>();
		word.add("car");
		word.add("so");
		word.add("it");
		insert(word);
		
	}
	
	
	public static void insert(ArrayList<String> arr) {
		for(int i = 0; i < arr.size(); i++ ) {
			String a = arr.get(i);
			
			if(a.length() == 2) {
				StringBuilder sb = new StringBuilder(a);
				sb.insert(1, "hello");
				arr.set(i,sb.toString());
			}
		}
		System.out.println(arr);
	}
	
	public static boolean isPalindrome(String word) {
		StringBuilder sb = new StringBuilder(word);
		String reversed = sb.reverse().toString();
		if(reversed.equals(word)) {
			return true;
		}else {
			return false;
		}
	}
	
	
//	public static String removeCan(String word, String target) {
//		word = word.toLowerCase();
//		if(word.length() < target.length()) {
//			System.out.println("Invalid data");
//			return "";
//		}else if (word.trim().contains(" ")) {
//			System.out.println("invalid data");
//			return "";
//		}
//	}
}
