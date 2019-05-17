package objectDataType;

public class bankAccountt {

	String type;
	int accountNumber;
	double balance;
	String holderName;
	
	public void deposit(double deposit1) {
		System.out.println(deposit1 + " double is deposited to your account");
		
		balance+=deposit1;
	}
	public void transfer(double transfer1) {
		System.out.println(transfer1 + " double $ is transfered from your accaunt");
		
		balance-=transfer1;
	}
	public void info () {
		System.out.println("Name: " + holderName + "\nBalance: " + balance + "\nType: " + type + "\nAccount NUmber : " + accountNumber);
	}
}
