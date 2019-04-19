package methods;

import java.util.Arrays;

public class myColltection {
	public static void main(String[] args) {
		int[] nums = { 23, 53, -4, -45, -785, 1 };

		printNegativeNums(nums);
		arrayReplace(nums, 40);
	}

	public static void printNegativeNums(int[] numbers) {
		for (int num : numbers) {
			if (num < 0) {
				System.out.println(num);
			}

		}
	}

	public static void arrayReplace(int[] numbers2, int replaceNum) {
		for (int i = 0; i < numbers2.length; i++) {
			if (numbers2[i] < 0) {
				numbers2[i] = replaceNum;

			}
		}
		System.out.println(Arrays.toString(numbers2));
	}
}
