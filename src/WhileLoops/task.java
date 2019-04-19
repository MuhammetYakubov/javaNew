package WhileLoops;
import java.util.Scanner;
public class task {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int balance = 1500;
	int transactionAmount;
	String itemName;
	while (balance > 0) {
    System.out.println("Enter the transaction amount");
	transactionAmount = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter your item name");
	itemName = sc.nextLine();
	if (itemName.equalsIgnoreCase("AK-47")){
		System.out.println("Illegal item");
		break;
	}if(transactionAmount > balance) {
		System.out.println("Transaction amout is too high.Try lower price");
		continue;
		}
	balance -= transactionAmount;
	System.out.println(itemName+" purchased succefully");	
	}
	
	if(balance == 0) {
		System.out.println("You'r broke!!!!");	
	}
	
	System.out.println("Your balance: "+balance );
	System.out.println("Name of your item ");
}
}
