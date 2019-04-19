package Presentation;

import java.util.Random;

public class IfElse {
 public static void main(String[] args) {
	Random rn = new Random();
	int i =rn.nextInt(100);
	System.out.println(i);
	int remainder = i % 2;
	if (remainder ==0) {
		System.out.println("number is even");
	}else {
		System.out.println("number is odd");
	}
}
}
