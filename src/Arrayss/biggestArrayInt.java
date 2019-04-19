package Arrayss;

import java.util.Arrays;

public class biggestArrayInt {
	public static void main(String[] args) {
		int[][] arrr = { { 4, 2, 6, 45, 23, 1 }, { 22, 34, 66 }, { 1, 2, 3 } }; 
	     num(arrr);
	}

	public static void num(int[][] arr) {
		int maxSum = Integer.MIN_VALUE;
		int indexOf = 0;
		
   for(int i = 0; i < arr.length; i++) {
	   int sum = 0;
	   for(int j = 0; j < arr[i].length; j++) {
		   sum += arr[i][j];
		   
	   }
	   if(sum > maxSum) {
		   maxSum = sum;
		   indexOf = i; 
	   }
   }
   System.out.println(Arrays.toString(arr[indexOf]));
	}
}
