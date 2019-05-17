package Overriding;

public class BankingTest {
	public static void main(String[] args) {
		
	
   BankAccount ba = new BankAccount();
   
   ba.accountNumber = 322323;
   ba.balance = 200;
   ba.name = "muhammet";
   System.out.println(ba.balance);
   ba.transfer(100);
   System.out.println(ba.balance);
   ba.deposit(100);
   System.out.println(ba.balance);
   
   
   
   System.out.println();	
   SavingsAccount b = new SavingsAccount();
   b.name = "Adam";
   b.balance = 1000;
   b.interestIncome = 30;
   b.accountNumber = 1212121;
   System.out.println(b.balance);
   b.transfer(100);
   System.out.println(b.balance);
  // b.info();
   
   
   
   System.out.println();
   checkingAccount a = new checkingAccount();
   a.balance = 300;
   System.out.println(a.balance);
   a.transfer(100);
   System.out.println(a.balance);
   
}
}