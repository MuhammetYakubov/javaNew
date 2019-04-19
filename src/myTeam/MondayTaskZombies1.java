package myTeam;
import java.util.Scanner;
import java.util.Arrays;
public class MondayTaskZombies1 {
public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    
	    for(int i=0; i < inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    String day= "Day ";
        boolean check= true;
        int count= 0;
        int dayCount= 0;
        
        do {
        	
        	count = 0;
        	for(int people: inhabitants) {
        		
        		if(people == 0) {
        			count++;
        		}if(count == 8) {
        			check = false;
        		}
        	}
        	
        System.out.println(day + dayCount + " "+ Arrays.toString(inhabitants));
        	dayCount++;
           for(int i = 0; i < inhabitants.length; i ++) {
        	   inhabitants[i] = inhabitants[i] / 2;
           }
        	
        }while(check);
        System.out.println("---- EXTINCT ----");
}
}
