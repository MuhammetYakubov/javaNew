package multidimentionalArrays;

public class maxNum2D {
public static void main(String[] args) {
	int [][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
	int maximum = 0;
	
	for(int []i : array ) {
		int sum = 0;
		for(int j : i){
		sum += j;
		
		}System.out.println(sum);
		if (sum > maximum) {
			maximum = sum;
		}
	}
	System.out.println(maximum);
	
}
}
