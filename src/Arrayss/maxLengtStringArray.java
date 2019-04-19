package Arrayss;

import java.util.Scanner;

public class maxLengtStringArray {
	public static void main(String[] args) {
		
	  Scanner input = new Scanner(System.in);
	  
	String[] words = {"heya","yolo","YOOOOO", "super long"," ez"};
		String max = "";
		int l = 0;
//		for(int i = 0; i < 5;  i++) {
//		  
//		  words[i] = input.nextLine();  
//		}
		
		for(String num :words) {
			if (num.length() > l) {
		
				l = num.length();
				
				max = num;
			}
		}
		System.out.println(max);
}
}