package WhileLoops;
import java.util.Scanner;
public class NumberGuessing {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int secretNum = 45;
	System.out.println("please enter secret num");
	int guess = sc.nextInt();
	
	while(guess != secretNum) {
		System.out.println("Wrong enter again");
		guess = sc.nextInt();
	}
	System.out.println("Congrats");
}
}
