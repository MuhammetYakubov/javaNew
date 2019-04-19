package Arrayss;
import java.util.Scanner;
import java.util.Arrays;
public class SearchBinaryLibrary {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String[] myBook = {"book1", "book2", "book3", "book4", "book5"};
	
	
	System.out.println("Please enter the book to replace:");
	String oldBook = input.nextLine();
	System.out.println("Please enter the new book");
	String newBook = input.nextLine();
	Arrays.sort(myBook);
	System.out.println(Arrays.toString(myBook));
	
	int result = Arrays.binarySearch(myBook, oldBook);
	
	if(result >= 0) {
		
	    myBook[result] = newBook;
	  
	}  
	
	Arrays.sort(myBook);
    System.out.println(Arrays.toString(myBook));
}
}
