package staticc;

import java.util.ArrayList;

import utilities.MyCollection;

public class MyCollectionTest {
	public static void main(String[] args) {

		 ArrayList<String> myList = MyCollection.getStringList();
		// System.out.println(myList);

//		ArrayList<String> myList1 = MyCollection.getStringList();
//		System.out.println(MyCollection.filterList(myList1, 3));

		System.out.println(MyCollection.removeDuplicates(myList));
	
		System.out.println("~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,.");
	}
}
