package NestedLoops;

public class Fibonacci {
public static void main(String[] args) {
	 int num1 = 0;
	  int num2 = 1;
	  String result = "";
	  String begin = "0 1 ";
	  
	  for (int i = 0; i < 4; i++) {
		 
		 int sum = num1 + num2;
		 num1 = num2;
		 num2 = sum;
		result += sum + " ";
		 
		
		 
	 }
   System.out.println("Fibonacci Series of 6 : " + begin + result);
}
}
