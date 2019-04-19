package myTeam;

import java.util.Arrays;

public class TeamActivityArray {
	public static void main(String[] args) {

		System.out.println(Arrays.toString(extractNum("sad56a897sda23ddf3")));

		boolean check = isAnagram("heartee", "heartee");
		System.out.println(check);
		int[] num1 = { 1, 2, 3, 4, 5, 6 };
		secondLargestNum(num1);
	}

	public static int[] extractNum(String str) {
		str.trim().toLowerCase();
		String b = "";
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (a >= 48 && a <= 57) {

				b += a;
				counter++;

			}
		}
		int[] num = new int[counter];
		for (int j = 0; j < b.length(); j++) {

			num[j] = (int) (b.charAt(j) - '0');
		}

		return num;
	}

	public static boolean isAnagram(String word1, String word2) {

		word1.trim().toLowerCase();
		word2.trim().toLowerCase();
		if (word1.contains(" ") || word2.contains(" ")) {
			word1 = word1.replace(" ", "");
			word2 = word2.replace(" ", "");
		}
		if (word1.length() != word2.length()) {
			return false;
		} else {
			for (int i = 0; i < word2.length(); i++) {
				if (word1.contains(word2.charAt(i) + "")) {
					word1 = word1.replaceFirst(word2.charAt(i) + "", "");
				}
			}
			if (word1.isEmpty()) {
				return true;
			} else {
				return false;
			}

		}

	}

	public static void secondLargestNum(int[] nums) {
		int max = nums[0];
		int secMax = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] < max && nums[j] > secMax) {
				secMax = nums[j];
			}

		}
		System.out.println(secMax);
	}
}
