package Loops;

import java.util.Scanner;

public class ForLoops {
public static void main(String[] args) {
	

	// ask user for name and print "good job, name" , except "James"
    Scanner sc = new Scanner(System.in);
    
    for(;;) {
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        if(name.equalsIgnoreCase("james")) {
            continue;
        } System.out.println("Good job " + name);

} 
	
}
}

