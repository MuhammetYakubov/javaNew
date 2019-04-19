package myTeam;
import java.util.Scanner;
import java.util.Random;
public class Tesk1 {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  Random rn = new Random();
	  System.out.println("Please enter your favorite song: ");
	  String name = sc.nextLine();
	  boolean valid,answer = false;
	  
	   
	  if (name.length()>=10) {
		  answer = true;
		  System.out.println("name of the song"+name);
	  }
		  else {
		  System.out.println("That's not a valid song name: ");
	  }
	  
	  
	  
	  if (answer) {
		  int random = rn.nextInt(10);
		  
		  if(random %2==0 ){
			valid = true;
			System.out.println("hit song");
		  } else  {
		  valid = false;
		  System.out.println("okay song");
	  }
	  }
  }
}
