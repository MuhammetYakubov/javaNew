package forEachLoops;

public class UpperCase {
public static void main(String[] args) {
	String[] Groceries={"Bread", "Cucumber", "apples", "orange", "cookies", "Cake"};
	int counter = 0;
	for(String items:Groceries) {
		char c = items.charAt(0);
		
		if(c >= 65 && c <= 90  ) {
			counter++;
		}
	}System.out.println("Total words starting with upper case: " +counter);
}
}
