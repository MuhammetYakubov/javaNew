package encapsulation;

public class trainingCheck {
public static void main(String[] args) {
	
	training a = new training();
	
	 a.setX(1);
	  a.setY(1);
	  a.plus();
	  System.out.println("1+1 = "+ a.getResult());//1+1 = 2
	  
	
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
