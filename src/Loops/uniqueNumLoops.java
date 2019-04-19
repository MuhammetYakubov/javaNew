package Loops;
import java.util.Random;
public class uniqueNumLoops {
public static void main(String[] args) {
	Random rn = new Random();
	String result = "";
	for (int i = 0; i <8; i++) {
		int ii = rn.nextInt(10);
	
		
		while (result.contains(ii+""));{
			ii = rn.nextInt(10);
			

		}
		result+=ii;	
			
	}
	System.out.println(result);		
}
}
