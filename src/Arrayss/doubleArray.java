package Arrayss;
import java.util.Arrays;
public class doubleArray {
public static void main(String[] args) {
	double[] price = {45.99, 23.5, 11.50, 33.33, 99.99};
	System.out.println(Arrays.toString(price));
	price [4] = 23.23;
	System.out.println(Arrays.toString(price));
	System.out.println(price.length);
}
}
