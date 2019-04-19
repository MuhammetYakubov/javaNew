package Arrayss;
import java.util.Scanner;
public class PlayersLoops {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String [] name = {"James", "John", "Adam", "Eliza", "Jamie", "Benzema"};
	int len = name.length;
	System.out.println("PLease enter key word");
	String keyword = input.nextLine().toLowerCase();
	
	for(int i = 0; i < len; i++) {
		String player = name[i];
		player = player.toLowerCase();
		if(player.contains(keyword)) {
			System.out.println(player);
		}
	}
	
}
}
