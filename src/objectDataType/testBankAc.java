package objectDataType;

public class testBankAc {
	public static void main(String[] args) {

		bankAccountt user = new bankAccountt();

		user.type = "Chase";
		user.accountNumber = 12345;
		user.balance = 1000.0;
		user.holderName = "Muhammet";
		
		System.out.println(user.balance);
		user.deposit(90.0);
		System.out.println(user.balance);
		System.out.println();
		
		user.transfer(100.0);
		System.out.println(user.balance);
		System.out.println();
		
		user.info();
	}
}
