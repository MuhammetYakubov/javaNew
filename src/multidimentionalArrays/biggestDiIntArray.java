package multidimentionalArrays;

public class biggestDiIntArray {
public static void main(String[] args) {
		int[][] arrr = { { 4, 2, 6, 45, 23, 1 }, { 22, 34, 66 }, { 1, 2, 3 } }; 
     biggestNum(arrr);
}
public static void biggestNum(int[] []num) {
	int counter = Integer.MIN_VALUE; 
	for(int [] num1:num) {
		
		for(int j: num1) {
		
			if(j > counter) {
			counter = j;
		}
		}
	}
	System.out.println(counter);
}
}
