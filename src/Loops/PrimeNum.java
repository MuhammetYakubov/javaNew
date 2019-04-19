package Loops;
import java.util.Scanner;
public class PrimeNum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    boolean check = true;
    int num = sc.nextInt();
    for(int i = 2; i < num; i++) {
    if(num%i == 0) {
	check = false;
}
}
    if(check)  {
	System.out.println(num +" is prime number!");
}   else {
	System.out.println(num +" is not prime number!");
}


}
}
