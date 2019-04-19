package IndexCharCartianEmpty;

public class AgainTask {
    public static void main(String[] args) {
		String s = "Account Number: 25555567ACCD";
        int i = s.indexOf(" ")+1;
        
        if(s.charAt(i) == 'n'){
        	System.out.println("Starts with lower case");
        }else {
        	System.out.println("strats with upper case");
        }
    }
}
