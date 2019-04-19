package StringManipulation;
import java.util.Scanner;
public class StringManipulation3 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter name 1:");
   
	String name= sc.nextLine();
    System.out.println("Please enter name 2:");
    String name1= sc.nextLine();
   
    boolean realitive;
   
    int space = name.indexOf(" ");
    int space1 = name1.indexOf(" ");
   
    String lastname = name.substring(space+1);
    String lastname2 = name1.substring(space1+1);
     if (lastname.equals(lastname2)) {
    	 System.out.println(realitive = true);
     }else {
    	 System.out.println(realitive = false);
     }
	}
}
