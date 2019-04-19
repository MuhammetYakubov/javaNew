package switchStatements;

public class Switcher {
	public static void main (String[] args) {
    String name = "John" ;
    
    switch(name) {
    case "James":
    	System.out.println("James is cool name");
    	break;
    case "Jany":
    	System.out.println("Jany is Ok name");
    	break;
    case "John":
    	System.out.println("John wick??");
    	break;
    default:
    	System.out.println("Everything else");
    }
   
}
}
