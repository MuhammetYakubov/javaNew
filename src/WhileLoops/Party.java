package WhileLoops;
import java.util.Scanner;
public class Party {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name; 
	String YesOrNo;
    String space = "";
	do{
		System.out.println("Please enter guest name:");
		name = sc.nextLine();
		name = name.substring(0,1).toUpperCase()+name.substring(1);
		System.out.println("Do you wanna to enter new guest name:yes or no");
	    YesOrNo = sc.nextLine().toLowerCase();
	    space += name + ", "; 
	
	}
	while(YesOrNo.equals("yes"));
	space = space.substring(0,space.length()-2);
	System.out.println("guest's list: "+space);
}
}
