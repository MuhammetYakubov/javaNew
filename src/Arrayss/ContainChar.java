package Arrayss;
import java.util.Arrays;
public class ContainChar {
public static void main(String[] args) {
	String[] numbers = {"zero", "one", "two","three","four"};
	System.out.println(Arrays.toString(numbers));
	int counter = 0;
    
	
	for(int i = 0; i < numbers.length; i++) {
		if(numbers[i].contains("e")) {
			counter++;
			
		}
	}
	String[] fewValues = new String [counter];
	int counter2 = 0;
	
	for(int j = 0; j < numbers.length; j++ ) {
		if(numbers[j].contains("e")) {
		fewValues[counter2] = numbers[j];
			counter2++;	
		}
	}
	
	System.out.println(Arrays.toString(fewValues));
	//System.out.print(numbers[i]+" ");
}
}
