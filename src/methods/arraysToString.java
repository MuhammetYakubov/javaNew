package methods;

public class arraysToString {
	public static void main(String[] args) {
		String[] colors = { "WEWE", "sdfdf", "dfeef", "adsgf" };

		System.out.println(returnArrays(colors));
	}

	public static String returnArrays(String[] arr) {
		String result = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				result += arr[i] + "]";
			} else {
				result += arr[i] + ", ";
			}
		}
		return result;
	}
}
