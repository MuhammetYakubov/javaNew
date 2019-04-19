package Arrayss;
import java.util.Scanner;
public class replitArrays {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int [] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
int num = 0;
	for (int i = 0; i < nums.length; i++) {
	num = 0;
	for(int j = 0; j < nums.length; j++) {
		if(nums[i] == nums[j]) {
			num++;
		}
	}
	if(num == 1) {
		System.out.println(nums[i] + "");
	}
}
}
}
