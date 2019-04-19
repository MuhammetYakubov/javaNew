package methods;
//import java.util.Scanner;

public class oddNum {
public static void main(String[] args) {
	printOdd();

//	Scanner sc = new Scanner(System.in);
//	String name = sc.nextLine();
	printNname("john");
	
//	int num = sc.nextInt();
	oddNum1(30);
	
}
public static void printOdd() {
	for(int i =1; i < 50; i++) {
		if(i % 2 == 1) {
			System.out.print(i+" ");
		}
	}
	System.out.println();
}
public static void printNname(String namee) {
	System.out.println("Welcome "+ namee + " !");
}
public static void oddNum1(int oddNum2) {
	for(int j = 0; j < oddNum2; j++) {
		if (j % 2 == 1) {
			System.out.print(j+" ");
		}
	}
}
}
