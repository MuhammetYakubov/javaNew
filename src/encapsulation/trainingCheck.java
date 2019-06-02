package encapsulation;

public class trainingCheck {
public static void main(String[] args) {
	
	
	  
	
	    String word = "Madam".toLowerCase();
	    String check = "";
	    for(int i = word.length()-1; i >= 0; i--){
	       char c = word.charAt(i);
	       check+=c+"";
	    }
	    System.out.println(check);
	    if(word.equals(check)){
	      System.out.println("Palindrome");
	    }else{
	      System.out.println("Not Palindrome");
	    }
	  
}
}
