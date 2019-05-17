package Overriding;

public class checkingAccount extends BankAccount{
	
	@Override
	public void transfer(double transfer1) {
		double fee = transfer1 * 0.05;
		double amount = transfer1 + fee;
		balance -= amount;
		System.out.println(transfer1 + " is transfered successfully with fee: " + fee);
	}

}
