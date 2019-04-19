package myTeam;
import java.util.Scanner;
public class MondayTask4 {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter word:");
String str = input.next().toLowerCase();

// Your code here 
//------------------------------------

String space= "";
	
	
	for(int i= 0; i < str.length(); i++ ) {
		
		char one= str.charAt(i);
		int count = 0;
		
		if(!space.contains(one + "")) {
		
		for(int j= 0; j < str.length(); j++) {
		
			char two= str.charAt(j);
			
			
			if(one == two) {
				count++;
				space += two;
			}
			
		}
		
		
		System.out.print(one + ":" + count + " ");
		
	}
		
	}	
		
System.out.println("");


// TASK 2
// Your code here
//------------------------------------

int balance= 100;
	int count= 3;
	int spent= 0;
	int bought= 0;
	
	do {
		
		System.out.println("Enter cost of item: ");
		int cost= input.nextInt();
		
		if(cost > balance) {
			System.out.println("You can't spend more than " + 100);
			continue;
		} else {
			balance -= cost;
			spent = 100 - balance;
			bought++;
			
			if(balance == 0) {
				break;
			}
			
			count--;
			if(count == 0) {
				break;
			}
			
			System.out.println("You spent $" + spent + " so far");

			System.out.println("You may buy up to " + count + " items");
			
		}
		
		
		
	} while(count > 0);
	
	
	System.out.println("You bought " + bought + " items, spent $" + spent + " and done shopping");
	



// TASK 3
// Your code here
//------------------------------------

int num []= {5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2};
	
	int counter= 0;
	
	for(int i= 0; i < num.length; i++) {
		
			int number= num[i];
				counter= 0;
			
			for(int j= 0; j < num.length; j++) {
				
				if(number == (num[j])) {
					counter++;
				}
				
			}

		 if(counter == 1) {
			 System.out.print(number + " ");
		 }
		
		
	}	
	

	}
}