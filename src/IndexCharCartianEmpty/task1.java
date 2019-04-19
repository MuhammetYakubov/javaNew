package IndexCharCartianEmpty;
import java.util.Scanner;
public class task1 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String number = "Your account number: 257389ACCD".trim();
	String number2 = "Your account number: 52317XYZ".trim();
    
	number.substring(0,26);
	String lastnum =number.substring(21,27);
	number2.substring(0,25);
	String lastnum2 = number2.substring(21,26);
	
	char ch = number.charAt(22);
	char ch2 = number2.charAt(21);
	 if (number.equals(ch) && number2.equals(ch2)){
	System.out.println("cool");
	
}else{
	System.out.println("not cool");
}
	 System.out.println(lastnum);
	 System.out.println(lastnum2);
		System.out.println(number);
		System.out.println(number2);
	 
 
 }
}