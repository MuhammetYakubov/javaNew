package methods;

public class varArgs {
	public static void main(String[] args) {
		num(23, 23, 23, 23, 23, 23);
		num1(23, 22, 12, 435, 45657, 45);
	}

	public static void num(int... num1) {
		for (int i : num1) {
			System.out.print(i + " ");
		}

	}

	public static void num1(int... num2) {
		int max = 0;
		for (int i : num2) {
			if (i > max) {
				max = i;
			}

		}
		System.out.println(max);
	}
}
