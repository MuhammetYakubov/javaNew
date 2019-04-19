package Loops;
import java.util.Scanner;
public class task2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter word");
	String name = sc.nextLine();
	System.out.println("please enter character");
	char c = sc.next().charAt(0);
    int counter = 0;
	for(int l = 0; l < name.length() ; l++) {
	    if (c == name.charAt(l)){
	 counter++;
	    	
	    }
	}
	System.out.println(counter);
}
}