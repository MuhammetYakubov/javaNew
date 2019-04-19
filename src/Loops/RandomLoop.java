package Loops;

import java.util.Random;
public class RandomLoop {
   public static void main(String[] args) {

	Random rn = new Random();
	int num = rn.nextInt(100);
	int attempts = 0;
	for (int i = 0; i <= 100; i++) {
		attempts++;
		if(i == num) {
			
			System.out.println("Number found" );
			System.out.println("NUmber attemps:  " +attempts);
			System.out.println("Target: "+num );
		break;
		}
		
	
	}
	   
	   
}
}
