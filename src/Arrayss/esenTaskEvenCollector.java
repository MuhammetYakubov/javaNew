package Arrayss;
import java.util.Arrays;
public class esenTaskEvenCollector {
public static void main(String[] args) {
	int nums[] = {1,2,-3,4,-34,55,78,90,33,10};
	int counter = 0;
	
	
	for(int i = 0; i < nums.length; i++) {
		if(nums[i] % 2 == 0) {			
			counter++;
		}
	}
	
	int nums1[] = new int [counter];
	int even = 0;
	for(int j = 0; j < nums.length; j++) {
		if(nums[j] % 2 == 0) {
		nums1[even] = nums[j];
		even++;
		}
	}

	
	System.out.println(Arrays.toString(nums1));
}
}
