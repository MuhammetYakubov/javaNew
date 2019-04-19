package IndexCharCartianEmpty;

public class OneMoreTasks {
public static void main(String[] args) {
	String s = "Account Number: 87654321";
	int num = s.indexOf(":") + 2;
	String num2 = s.substring(num);
	
	if(num2.length() == 8) {
		System.out.println("Valid account number");
	}else {
		System.out.println("Invalid account number");
	}
}
}
