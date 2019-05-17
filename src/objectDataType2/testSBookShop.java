package objectDataType2;

import java.util.Arrays;
import java.util.Scanner;

public class testSBookShop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Book myBook1 = new Book();

		myBook1.author = "Martin";
		myBook1.title = "Game of Thrones";
		myBook1.pages = 450;

		Book myBook2 = new Book();

		myBook2.author = "Tolstoy";
		myBook2.title = "War and Peace";
		myBook2.pages = 1800;

		Book myBook3 = new Book();

		myBook3.author = "Rawling";
		myBook3.title = "Harry Potter";
		myBook3.pages = 1200;

		Book[] myBooks = new Book[3];
		myBooks[0] = myBook1;
		myBooks[1] = myBook2;
		myBooks[2] = myBook3;

		for (Book b : myBooks) {
			System.out.println(b.author);

		}

		System.out.println("\nPLease enter total books");
		int length = sc.nextInt();

		Book[] bookStore = new Book[length];

		for (int i = 0; i < length; i++) {
			sc.nextLine();
			Book book1 = new Book();
			System.out.println("Please enter title for book " + (i + 1));
			book1.title = sc.nextLine();

			System.out.println("Please enter author for book " + (i + 1));
			book1.author = sc.nextLine();

			System.out.println("Please enter pages  for book " + (i + 1));
			book1.pages = sc.nextInt();
			bookStore[i] = book1;

		}
		System.out.println(bookStore[0].author);
	}
}