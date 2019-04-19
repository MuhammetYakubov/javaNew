package methods;

import java.util.Arrays;
import java.util.Random;

public class Arrays2Int {
	public static void main(String[] args) {
		int[] neww = num(10, 10);
		System.out.println(Arrays.toString(neww));
		System.out.println(arr(neww));
	}

	public static int[] num(int size, int bound) {
		int[] newArray = new int[size];
		Random rn = new Random();

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = rn.nextInt(bound);
		}
		return newArray;
	}

	public static int arr(int[] returns) {
		int counter = 0;
		for (int i : returns) {
			if (i % 2 == 0) {
				counter++;
			}
		}
		return counter;

	}
}
