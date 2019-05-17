package multidimentionalArrays;

import java.util.Arrays;
import java.util.Random;

public class creat2DArrayRandomNum {
public static void main(String[] args) {
	int [][] numm = getMultiArray(3, 4);
    
	System.out.println(Arrays.deepToString(numm));
}
public static int [][]getMultiArray (int num1, int num2){
	
	int [][] number = new int [num1][num2];
	Random rn = new Random();
	
	for(int i = 0; i < number.length; i++) {
		
		for(int j = 0; j < number[i].length; j++) {
			
			number [i][j] = rn.nextInt(100); 
		}
	}
	return number;
}
}
