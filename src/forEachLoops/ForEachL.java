package forEachLoops;

public class ForEachL {
public static void main(String[] args) {
	String[] favoriteFruits = {"Orange","Apple","Pineapple","Mango"};
    for(String names:favoriteFruits) {
    	if(names.length() % 2 == 0){
 
   
    	System.out.println("Fruits "+names);
    	}
    }

}

}
