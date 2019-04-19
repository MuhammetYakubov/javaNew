package myTeam;
import java.util.Scanner;
public class taksAgain {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int unitPrice;
	int quantity;
	double GrandTotal = 0.0;
	int Discount = 0;
	double DiscountApplied = 0.0;
	double Total = 0.0;
	System.out.println("please enter your unitePrice");
	unitPrice = sc.nextInt();
	System.out.println("please enter your quantity");
	quantity = sc.nextInt();
	
	GrandTotal = (unitPrice * quantity);
	if(quantity < 100) {
		Discount = 0;
	}else if (quantity > 100 && quantity <120) {
		Discount = 10;
	}else {
		Discount = 15;
	}
	DiscountApplied = (GrandTotal * Discount);
	Total = (GrandTotal - DiscountApplied);
    System.out.println("Grand Total: $ "+GrandTotal);
    System.out.println("Discount: $ "+Discount);
    System.out.println("Discount applied: $ "+DiscountApplied);
    System.out.println("Total: $ : "+Total);
    
	
	
}
}
