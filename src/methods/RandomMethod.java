package methods;
import java.util.Random;;
public class RandomMethod {
public static void main(String[] args) {
    
	createUsername("James", "Bond");
	
	reverseString("James");
}
public static void createUsername(String firstName, String lastName){
	 Random rn = new Random();
     int  num = rn.nextInt(100);
	System.out.println(firstName.toLowerCase()+lastName.toLowerCase()+num);
	
	
}
public static void reverseString(String name) {
	for(int i = name.length()-1; i >= 0; i--) {
		System.out.print(name.charAt(i));
	}
}
}
