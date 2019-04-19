package Loops;
import java.util.Scanner;
public class MyLoop {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = sc.nextLine();
	
//		for(int num1 = 0 ; num1 <= 5 ; num1++) {
//			System.out.println("Welcome "+name);
//		}
		int l = name.length();
	    for (int num = 0; num<l; num++ ) {
	    	char c = name.charAt(num);
	    	 System.out.println(c);
	       
	    }
    
    }
}
