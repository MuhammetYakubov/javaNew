package inputs;

import java.util.Scanner;

public class Muhammet {
 public static void main (String[] args) {
	 Scanner ss = new Scanner(System.in);
	 int num1;
	 
	 System.out.println("Welcome to time calculator");
	 System.out.println("Please enter total seconds");
	 num1 = ss.nextInt();
	 System.out.println( (num1)+" seconds converted into:");
	 System.out.println( (num1/60) +" minutes" );
	 System.out.println(+(num1%60) +" seconds");
	 	 
 }
}

//int seconds = ss.nextInt();
//int minutes = seconds/60;
//int remainingSeconds = seconds % 60;
//