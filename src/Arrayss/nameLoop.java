package Arrayss;

public class nameLoop {
public static void main(String[] args) {
	String []name = {"James", "John", "Adam", "Eliza", "Jamie", "Benzema"};
	int len = name.length;
	
	for(int i = 0; i < len; i++) {
		//String players = name[i];
		//System.out.println(players.charAt(0));
	
	  String players = name[i];
	  if(players.endsWith("s")) {
		  System.out.println(players);  
	  }
			//System.out.println(name[i].charAt(0));
	}
}
}
