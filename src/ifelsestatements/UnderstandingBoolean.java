package ifelsestatements;
import java.util.Scanner;
public class UnderstandingBoolean {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		boolean currentStudent;
		System.out.println("Please enter your name: ");
		name=sc.nextLine();
		System.out.println("Are you a student currently?\nYes/No");
	   
		String name1 =sc.nextLine(); 
		if(name1.equals("Yes")) {
			currentStudent =true;
		}
		else {
			currentStudent = false;
		}
		System.out.println("Name: " +name);
		System.out.println("currentStudent: " +currentStudent);
		if (currentStudent== true) {
			System.out.println(name+ " you rock");
		}
	}
	

}
