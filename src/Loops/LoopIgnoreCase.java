package Loops;
import java.util.Scanner;
public class LoopIgnoreCase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	for( ; ; ) {
	String name = sc.nextLine();
	if (name.equalsIgnoreCase("hi")){
		System.out.println("hello");
	}else if (name.equalsIgnoreCase("exit")){
	break;
	}
	else{
	System.out.println("good bye");
	}
		
	}
	}
}

