package Overriding;

public class BankAccount {

	public double balance = 0;
	public int accountNumber = 0;
	public String name;

	public void info() {
		System.out.println("Information:");
		System.out.println("Balance: " + this.balance);
		System.out.println("Account number: " + this.accountNumber);
		System.out.println("Name: " + this.name);
	}

	public void transfer(double transfer1) {
		
		double fee = transfer1 * 0.1;
		double amount = transfer1 + fee;
		balance -= amount;
		System.out.println(transfer1 + " is transfered successfully with fee: " + fee);

	}

	public void deposit(double deposit1) {
		System.out.println(deposit1 + " is deposited to account number " + this.accountNumber);
		balance += deposit1;
	}
}
