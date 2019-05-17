package ArraysList;

import java.util.ArrayList;
public class ArraysMethods {
public static void main(String[] args) {
	
 	ArrayList<String> names = new ArrayList<>();
    
 	System.out.println(names.size());
 	
 	names.add("Muhammet");
 	names.add("Jemshit");
 	
 	System.out.println(names);
 	
 	System.out.println(names.size());

 	names.add(0, "Yakup");
 	System.out.println(names);

 	System.out.println(names.get(1));
 	System.out.println(names.get(names.size()-1));
 	
 	System.out.println(names.contains("Adam"));
 	
 	names.remove("Jemshit");
 	System.out.println(names);
 	
 	names.remove(0);
 	System.out.println(names);
 	
 	names.add("Ayna");
 	System.out.println(names);
 	
 
 	System.out.println(names.indexOf("Ayna"));
 	
 	names.set(0, "jemshit");
 	System.out.println(names);
}
}
