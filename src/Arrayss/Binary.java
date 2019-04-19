package Arrayss;
import java.util.Scanner;
import java.util.Arrays;
public class Binary {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int decimal = input.nextInt();
	int[] binary = new int[8];
	 for(int i=7; i>=0; i--){
      binary[i] = decimal%2;
      decimal = decimal/2;
    }
	
	System.out.println(Arrays.toString(binary));


//    int[] binary = new int[8];
//    int n=0;
//    int result=1;
//    for(int i =0; i < binary.length; i++) {
//      binary[i] = input.nextInt();
//    }
//    
//    //TODO: Write your code below.
//    for(int i=7; i>=0; i--){
//   
//      if(binary[i]==1){
//        n=n+result;
//      } result= result*2;
//    }System.out.println(n);


}
}
