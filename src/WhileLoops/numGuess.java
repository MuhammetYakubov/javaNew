package WhileLoops;
import java.util.Scanner;
import java.util.Random;
public class numGuess {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		Random r = new Random();
	    int num;
	    int randomNum = r.nextInt(100);
	    do{	
		System.out.println("please guess number");
		 num = sc.nextInt();
	    if(num > randomNum) {
	    	System.out.println("guess is too high");
	    }  else if ( num < randomNum) {
	    	System.out.println("guess is too low");
	    }else {
	    	System.out.println("contrats bro!!"); 	
	    }
	}
	    while(num != randomNum);
	
}
}
