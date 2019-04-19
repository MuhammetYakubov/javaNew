package arrayDataDriven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class newFile {
public static void main(String[] args) throws FileNotFoundException {
	File file = new File("test.txt");
	Scanner sc= new Scanner(file);      
	  while(sc.hasNextLine()){  
		String name = sc.nextLine().trim();
		System.out.println(name);
	if(name.length() == 5 ) {
	System.out.println(name);
	}	
    if(name.isEmpty()) {
	continue;
	}
	  }
	  }
}
