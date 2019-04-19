package arrayDataDriven;

import java.util.Arrays;

public class TwoMaxNum {
public static void main(String[] args) {
	int [] nums = {23,1,34,3,54,54,51};
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));
	int last = nums.length-1; 
	System.out.println(nums[last]);

	for(int i = last; i >= 0; i--) {
       if(nums[last] != nums[i]) {
    	   System.out.println(nums[i]);
    	   break;
       }	
	}
}
}
