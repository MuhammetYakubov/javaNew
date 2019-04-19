package switchStatements;

import java.util.Scanner;

public class AgeValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please write your age");
		int age = sc.nextInt();
		
		if(age > 0 && age <= 120) {
		switch (age) {
			case 24: 
				System.out.println("almost done with university");
	            break;
			case 16: 
				System.out.println("alomst done with high school");
			    break;
		   default:
			   System.out.println("keep living");
	     
		}
		}
		else{
			System.out.println("invalid");
		}
	}
}
