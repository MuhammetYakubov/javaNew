package Arrayss;
import java.util.Scanner;
public class replitHas55 {
	  public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int[] nums = {1, 5, 5, 1, 1};
		    
		    int counter = 0;
		    for(int i = 0; i < nums.length-1; i++) {
		    	if(nums[i] == 5) {
		    		if(nums[i+1] == 5) {
		    			counter++;	
		    		}
		    	}
		    	}
		    if(counter > 0) {
		    	System.out.println(true);
		    }else {
	    		System.out.println(false);
}
}
	  }