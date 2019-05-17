package multidimentionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Arrayss.NewArray;
import WhileLoops.task;

public class traingin {

	public static void main(String[] args) {

		System.out.println(mergeStrings("java", "selenium"));

		System.out.println(at3("blabla", "a"));

		ArrayList<String> arrr = new ArrayList<>();
		arrr.add("sad");
		arrr.add("bad");
		arrr.add("yo");
		arrr.add("yolo");
		arrr.add("Yess");
		System.out.println(arrr);
		System.out.println(swap(arrr, 0, 2));

		ArrayList<Integer> arr1 = new ArrayList<>();
		Integer[] nums = new Integer[] { 1, 1, 2, 3 };
		arr1.addAll(Arrays.asList(nums));

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("1");
		arr.add("10");
		arr.add("3");
		arr.add("nanuk");
		arr.add("nanuk");
		arr.add("nanuk");

		boolean hunt = nanuk(arr, 2, 7);
		if (hunt) {
			System.out.print("successful hunt");
		} else {
			System.out.print("this hunt is doomed");
		}

	}

//-----------------------------------------------------------------------------------------------------
	public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {

//		 int countNanuk = 0;
//		    int count = 0;
//		    for(String str : r){
//		      if(str.equals("nanuk")){
//		        countNanuk++;
//		      } 
//		      else{
//		        count += Integer.parseInt(str);
//		      } 
//		    }
//		    return countNanuk <= way_stones && count >= boast;
//		

		int count = 0;
		int sum = 0;
		if (r.contains("nanuk")) {

			for (String str : r) {
				if (Character.isDigit(str.charAt(0))) {
					int num = Integer.parseInt(str);
					sum += num;
				} else {
					count++;
				}
			}
			if (count <= way_stones && sum >= boast) {
				return true;
			} else {
				return false;
			}

		} else {
			for (int i = 0; i < r.size(); i++) {
				String word = r.get(i);
				sum += Integer.parseInt(word);

			}
			if (sum >= boast) {
				return true;
			} else {
				return false;
			}

		}
	}

//----------------------------------------------------------------------------------------------
	public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
		String a = list.get(pos2);
		String b = list.get(pos1);

		list.set(pos1, a);
		list.set(pos2, b);

		return list;
	}

//-----------------------------------------------------------------------------------------------------
	public static ArrayList<Integer> appendPosSum(ArrayList<Integer> arr) {
		ArrayList<Integer> newArr = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > 0) {
				sum += arr.get(i);
				newArr.add(arr.get(i));
			}

		}
		newArr.add(sum);
		return newArr;
	}

//-----------------------------------------------------------------------------------------------------
	public static String at3(String target, String word) {
		String neww = "";
		for (int i = 0; i < target.length(); i++) {
			if (i == 3) {
				neww += word;

			}
			char l = target.charAt(i);
			neww += l;
		}
//	    target = target.substring(3);
//	    neww+=target;
		return neww;
	}

//-----------------------------------------------------------------------------------------------------
	public static String mergeStrings(String one, String two) {
		String s = "";
		int smallest = 0;
		if (one.length() < two.length()) {
			smallest = one.length();
		} else {
			smallest = two.length();
		}
		for (int i = 0; i < smallest; i++) {

			s += one.charAt(i);

			s += two.charAt(i);

		}
		s += one.substring(smallest);
		s += two.substring(smallest);

		return s;
	}

}// end main
