package methods;

import java.util.Arrays;

public class addWord2DArr {
	public static void main(String[] args) {
		int[] ages = { 19, 21, 22, 23, 24, 25 };
		System.out.println(arrayContains(ages, 21));
		String[] newString = { "hi", "bye", "yes" };
		System.out.println(Arrays.toString(addElement(newString, "hello",2)));

	}

	public static String[] addElement(String[] arr, String word, int num) {
		String[] newArr1 = new String[arr.length + 1];
		for (int i = 0; i < newArr1.length; i++) {
			if (i == num) {

				newArr1[i] = word;

			} else if (i < num) {

				newArr1[i] = arr[i];

			} else {

				newArr1[i] = arr[i - 1];

			}
		}

		return newArr1;
	}

	public static String[] addElement(String[] check, String input) {
		String[] newArr = new String[check.length + 1];
		for (int i = 0; i < check.length; i++) {
			newArr[i] = check[i];

		}
		newArr[newArr.length - 1] = input;
		return newArr;
	}

	public static boolean arrayContains(int[] arr, int target) {
		for (int i : arr) {
			if (i == target) {
				return true;
			}
		}
		return false;
	}
}
