package Arrayss;
import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[] nums = {4, 3, 2, 44, 1, 100, 55};
    int back = nums.length-1;
	for(int i = 0; i <nums.length/2; i++) {
		
		int temp = nums[i];
		nums[i] = nums[back];
		nums[back] = temp; 
		back--;
		
	}
	
	
	
	System.out.println(Arrays.toString(nums));
}
}
