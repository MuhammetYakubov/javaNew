package myTeam;

import java.util.Scanner;

public class ScanenerPractice {
  public static void main(String[] args) {
	      
	      // Task 1
	      int unitPrice;
	      int quantity;
	      double grandTotal=0.0;
	      int discount=0;
	      double discountApplied=0.0;
	      double total=0.0;
	      
	      Scanner input = new Scanner(System.in);
	      
	      System.out.println("Enter unit price:");
	      unitPrice = input.nextInt();
	      
	      System.out.println("Enter quantity:");
	      quantity = input.nextInt();
	      
	      // your code here. (DO NOT change existing code)
	      //----------------------------------------------
	    
	         grandTotal= (unitPrice * quantity);
	         if( quantity < 100) {  
	             discount= 0;
	         } else if( quantity >= 100 && quantity <=120 ) {
	             discount= 10;
	         } else {
	             discount= 15;
	         } 
	         
	         discountApplied= (grandTotal*discount)/100;
	         total = (grandTotal - discountApplied);
	      
	      //----------------------------------------------
	      System.out.println("Grand Total: $ "+grandTotal);
	      System.out.println("Discount: $ "+discount);
	      System.out.println("Discount applied: $ "+discountApplied);
	      System.out.println("Total: $ : "+total);
	      
	      //==============================================
	      // Task 2
	      int price=0;
	      int quarter=0;
	      int dime = 0;
	      int nickle=0;
	    
	      System.out.println("Enter price in cents:");
	      price = input.nextInt();
	      
	      
	      // your code here. (DO NOT change existing code)
	      //----------------------------------------------
	    int amount=0;
	    amount = 100 -price;
	    quarter = amount /25;
	    amount=amount%25;
	    //amount%=25;
	    dime=amount /10;
	    //amount%=10;
	    amount=amount%10;
	    nickle=amount/5;
	    //amount%=5;
	    amount=amount%5;
	      //----------------------------------------------
	      System.out.println("Your change is "+quarter+" quarters, "+dime+" dimes, and "+nickle+" nickels.");
	      
	      //==============================================
	      //Task 3
	      int numberOfCall;
	      double bill=0.0;
	      System.out.println("Enter number of calls:");
	      numberOfCall = input.nextInt();
	      
	      // your code here. (DO NOT change existing code)
	      //----------------------------------------------
	      if(numberOfCall <= 100) {
	              bill= 200;
	          } else if (numberOfCall > 100 && numberOfCall <= 150) {
	              bill= 200 + (numberOfCall-100) * (0.6) ;
	          } else if (numberOfCall > 150 && numberOfCall <= 200) {
	              bill = (50 * 0.6) + ((numberOfCall-150) * 0.5) + 200;
	          } else {
	              bill= (50*0.6) + (50* 0.5) + ((numberOfCall - 200) * 0.4) + 200;
	          }
	      
	      //----------------------------------------------
	      System.out.println("Your bill is $"+bill);
	      
	    }
	  }
