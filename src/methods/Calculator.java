package methods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       
    	    
	System.out.println(sum(2,3));
	System.out.println(substract(3,3));
	System.out.println(divide(8,2));
}
    public static int sum (int a, int b) {
	int sum = a + b;
	return sum;
}
    public static int substract(int a, int b) {
	int sum = a * b;
	return sum;
}
    public static int divide (int a, int b) {
	int sum = a / b;
	return sum;
}

}