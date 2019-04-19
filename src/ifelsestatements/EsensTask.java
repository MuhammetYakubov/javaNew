package ifelsestatements;

import java.util.Scanner;
public class EsensTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        
        if ((num1 == num2) && (num2 == num3)){
        	System.out.println("They all equal");
        }
        else if ((num2 > num1) && (num2 > num3)) {
        	System.out.println("Maximum value of " + num1+"," + num2+", and " +num3+" " +"is: " +num2 );
        }
        else if ((num3 > num1) && (num3 > num2)){
        	System.out.println("Maximum value of " + num1+"," + num2+", and " +num3+" " +"is: " +num3 );
        }
        else if ((num1 > num2) && (num1 > num3)) {
        	System.out.println("Maximum value of " + num1+"," + num2+", and " +num3+" " +"is: " +num1 );
        }
        else {
        	System.out.println("they are not equal");
        }
	}

}
