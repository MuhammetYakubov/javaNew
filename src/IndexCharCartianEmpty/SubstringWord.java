package IndexCharCartianEmpty;
import java.util.Scanner;
public class SubstringWord {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter the word");
	String n1 = scanner.nextLine().trim();
	
	int l = n1.length()/2;
  
	if ( n1.length()%2== 1 && n1.length()>= 5 ) {
    String midOdd = n1.substring( l,l+1);
    System.out.println(midOdd);


	}else {
		
	}
	
//	 boolean w = n1.length()%2==1;
//     int n = n1.length();
//     if(w && n>=3){
//       char n2 = n1.charAt(n/2);
//       System.out.println(n2);
//     }
}
}
