package StringManipulation;
import java.util.Scanner;


public class BackAround {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
	String name = scanner.nextLine().trim();
	String  back;
	
	back = name.substring(name.length()-1);
	
	System.out.println(back + name + back);
	

}
}
