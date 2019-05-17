package Overriding;

public class SavingsAccount extends BankAccount {

	public double interestIncome ;

	@Override
	public void transfer(double transfer1) {

		double fee = transfer1 * 0.2;
		double amount = transfer1 + fee;
		balance -= amount;
		System.out.println(transfer1 + " is transfered successfully with fee: " + fee);

	}
	
	@Override
	public void info() {
		System.out.println("Information:");
		System.out.println("Balance: " + this.balance);
		System.out.println("Account number: " + this.accountNumber);
		System.out.println("Name: " + this.name);
		System.out.println("Interest income: " + this.interestIncome);
	}
}
