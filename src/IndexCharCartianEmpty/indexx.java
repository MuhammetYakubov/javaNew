package IndexCharCartianEmpty;
import java.util.Scanner;
public class indexx {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the message");
    	String name = sc.nextLine().toLowerCase().trim();
        
        int first = name.indexOf("heck");
        int second = name.indexOf("silli");
        int third = name.indexOf("idiot");
        
        System.out.println(first+", "+second+", "+third);
        
        if(first == -1 && second == -1 && third == - 1) {
        	System.out.println("Massage sent");
        }else {
        	System.out.println("Message faild");
        }
    }
}
